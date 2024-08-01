package com.example.syncCalendar.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryCalendarDAO {

    private final List<com.example.syncCalendar.model.Calendar> DAYS = new ArrayList<>();


    public List<com.example.syncCalendar.model.Calendar> findAllDays() {
        return DAYS;
    }

    public com.example.syncCalendar.model.Calendar saveDays(com.example.syncCalendar.model.Calendar day) {
        DAYS.add(day);
        return day;
    }

    public com.example.syncCalendar.model.Calendar updateDays(com.example.syncCalendar.model.Calendar day) {
        // TODO: 01.08.2024  
        return null;
    }


    public void deleteDayDescription(String day) {
        // TODO: 01.08.2024  
    }

}
