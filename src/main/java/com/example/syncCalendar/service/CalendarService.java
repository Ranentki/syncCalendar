package com.example.syncCalendar.service;

import com.example.syncCalendar.model.Calendar;

import java.util.List;

public interface CalendarService {

    List<Calendar> findAllDays();

//    Calendar saveDays(Calendar day);
    Calendar updateDays(Calendar day);

    void deleteDayDescription(Calendar day);
}
