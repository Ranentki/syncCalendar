package com.example.syncCalendar.controller;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.service.CalendarService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
//@RequestMapping("/days")
public class CalendarController {

    private final CalendarService service;

//    @GetMapping("/hello")
//    public String getString(){
//        return "This string is awesome!";
//    }

    @GetMapping("/days")
    public List<Calendar> findAllDays(){
        return service.findAllDays();
    }
}
