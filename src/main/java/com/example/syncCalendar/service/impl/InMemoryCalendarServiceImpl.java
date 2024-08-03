package com.example.syncCalendar.service.impl;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.repository.InMemoryCalendarDAO;
import com.example.syncCalendar.service.CalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryCalendarServiceImpl implements CalendarService {

    private final InMemoryCalendarDAO dao;
    public InMemoryCalendarServiceImpl (InMemoryCalendarDAO dao) {
        this.dao = dao;
    }
    @Override
    public List<Calendar> findAllDays() {
        return dao.findAllDays();
    }

//    @Override
//    public Calendar saveDays(Calendar day) {
//        return dao.saveDays(day);
//    }

    @Override
    public Calendar updateDays(Calendar day) {
        return dao.updateDays(day);
    }

    @Override
    public void deleteDayDescription(Calendar day) {
         dao.deleteDayDescription(day);
    }
}
