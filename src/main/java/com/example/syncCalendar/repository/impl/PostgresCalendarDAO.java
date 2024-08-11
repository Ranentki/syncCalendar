package com.example.syncCalendar.repository.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.repository.CalendarDAO;

@Repository("postgres")
public class PostgresCalendarDAO implements CalendarDAO {

    private final JdbcTemplate jdbcTemplate;

    public PostgresCalendarDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Calendar> findAllDays() {
        final String sqlStatement = "SELECT day, description FROM calendar";
        return jdbcTemplate.query(
                sqlStatement,
                (resultSet, rowNum) -> new Calendar(
                        resultSet.getInt("day"),
                        resultSet.getString("description")));
    }

    @Override
    public Calendar updateDays(Calendar day) {
        final String sqlStatement = "INSERT INTO calendar (day, description) VALUES (?, ?)";
        jdbcTemplate.update(sqlStatement, day.getDay(), day.getDescription());
        return day;
    }

    @Override
    public Calendar findDescriptionByDay(int day) {
        final String sqlStatement = "SELECT description FROM calendar WHERE day = ?";
        List<String> results = jdbcTemplate.queryForList(sqlStatement, String.class, day);
        String description = results.isEmpty() ? null : results.get(0);
        return new Calendar(day, description);
    }

    @Override
    public void deleteDayDescription(Calendar day) {
        final String sqlStatement = "DELETE FROM calendar WHERE day = ?";
        jdbcTemplate.update(sqlStatement, day.getDay());
    }

}
