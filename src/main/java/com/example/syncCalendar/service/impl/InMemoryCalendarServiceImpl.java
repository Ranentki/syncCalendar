package com.example.syncCalendar.service.impl;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.service.CalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryCalendarServiceImpl implements CalendarService {
    @Override
    public List<Calendar> findAllDays() {
//        return List.of(
//                Calendar.builder().day(1).description("Raaawar").build(),
//                Calendar.builder().day(2).build(),
//                Calendar.builder().day(3).build(),
//                Calendar.builder().day(4).build(),
//                Calendar.builder().day(5).build(),
//                Calendar.builder().day(6).build(),
//                Calendar.builder().day(7).build(),
//                Calendar.builder().day(8).build(),
//                Calendar.builder().day(9).build(),
//                Calendar.builder().day(10).build(),
//                Calendar.builder().day(11).build(),
//                Calendar.builder().day(12).build(),
//                Calendar.builder().day(13).build(),
//                Calendar.builder().day(14).build(),
//                Calendar.builder().day(15).build(),
//                Calendar.builder().day(16).build(),
//                Calendar.builder().day(17).build(),
//                Calendar.builder().day(18).build(),
//                Calendar.builder().day(19).build(),
//                Calendar.builder().day(20).build(),
//                Calendar.builder().day(21).build(),
//                Calendar.builder().day(22).description("Nyaaaa").build(),
//                Calendar.builder().day(23).build(),
//                Calendar.builder().day(24).build(),
//                Calendar.builder().day(25).build(),
//                Calendar.builder().day(26).build(),
//                Calendar.builder().day(27).build(),
//                Calendar.builder().day(28).build(),
//                Calendar.builder().day(29).build(),
//                Calendar.builder().day(30).build(),
//                Calendar.builder().day(31).build()
//        );
        return null;
    }

    @Override
    public Calendar updateDays(Calendar day) {
        return null;
    }

    @Override
    public void deleteDayDescription(String day) {

    }
}
