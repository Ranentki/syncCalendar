package com.example.syncCalendar.service.impl;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.repository.CalendarDAO;
import com.example.syncCalendar.service.CalendarService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseCalendarService implements CalendarService {

    private final CalendarDAO dao;

    // @Qualifier позволяет нам выбрать необходимую имплементацию
    public BaseCalendarService(@Qualifier("postgres") CalendarDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Calendar> findAllDays() {
        return dao.findAllDays();
    }

    @Override
    public Calendar updateDays(Calendar day) {
        return dao.updateDays(day);
    }

    @Override
    public void deleteDayDescription(Calendar day) {
        dao.deleteDayDescription(day);
    }
}
