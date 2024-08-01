package com.example.syncCalendar.controller;

import com.example.syncCalendar.model.Calendar;
import com.example.syncCalendar.service.CalendarService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/days")
public class CalendarController {

    private final CalendarService service;

//    @GetMapping("/hello")
//    public String getString(){
//        return "This string is awesome!";
//    }

//    @GetMapping("/days")
    @GetMapping
    public List<Calendar> findAllDays(){
        return service.findAllDays();
    }

    @PostMapping("save_day")
    public String saveDays(@RequestBody Calendar day) {
        service.saveDays(day);
        return "Day saved";
    }

    @PutMapping("update_days")
    public Calendar updateDays (@RequestBody Calendar day){
        return service.updateDays(day);
    }
}
