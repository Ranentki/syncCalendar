package com.example.syncCalendar.repository;

import java.util.List;

import com.example.syncCalendar.model.Calendar;

public interface CalendarDAO{

    public List<Calendar> findAllDays();

    public Calendar updateDays(Calendar day);

    public Calendar findDescriptionByDay(int day);


    public void deleteDayDescription(Calendar day);

}
