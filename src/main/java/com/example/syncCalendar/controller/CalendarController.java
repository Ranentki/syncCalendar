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
//@RequestMapping("/days")
public class CalendarController {

    private final CalendarService service;

    @GetMapping("/days")
    public List<Calendar> findAllDays(){
        return service.findAllDays();
    }

//    @PostMapping("save_day")
//    public String saveDays(@RequestBody Calendar day) {
//        service.saveDays(day);
//        return "Day saved";
//    }

    @PatchMapping("/days")
    public Calendar updateDays (@RequestBody Calendar day){
        return service.updateDays(day);
    }

    @DeleteMapping("/delete")
    public void deleteDay (@RequestBody Calendar day){
        service.deleteDayDescription(day);
    }
}
