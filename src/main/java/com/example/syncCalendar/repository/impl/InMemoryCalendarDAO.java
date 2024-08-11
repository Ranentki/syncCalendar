package com.example.syncCalendar.repository.impl;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.repository.CalendarDAO;

import java.util.List;

@Repository("inMemory")
public class InMemoryCalendarDAO implements CalendarDAO {

    private List<Calendar> days;

    public InMemoryCalendarDAO() {
        days = new ArrayList<>();
        for (int i = 1; i < 32; i++) {
            days.add(new Calendar(i, null));
        }
    }

    public List<Calendar> findAllDays() {
        return days;
    }

    public Calendar updateDays(Calendar day) {
        days.set(day.getDay() - 1, day);
        return day;
    }

    @Override
    public Calendar findDescriptionByDay(Calendar day) {
        return null;
    }

    public void deleteDayDescription(Calendar day) {
        days.set(day.getDay() - 1, new Calendar(day.getDay(), null));
    }

}
