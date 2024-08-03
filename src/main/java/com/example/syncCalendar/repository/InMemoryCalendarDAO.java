package com.example.syncCalendar.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import com.example.syncCalendar.model.Calendar;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryCalendarDAO {

    private List<Calendar> days;

    public InMemoryCalendarDAO(){
        days = new ArrayList<>();
        for(int i = 1; i < 32; i++){
            days.add(new Calendar(i,null));
        }
    }

    public List<Calendar> findAllDays() {
        return days;
    }

//    public Calendar saveDays(Calendar day) {
//        days.add(day);
//        return day;
//    }

    public Calendar updateDays(Calendar day) {
        days.set(day.getDay()-1, day);
        return day;
    }


    public void deleteDayDescription(Calendar day) {
        days.set(day.getDay()-1, new Calendar(day.getDay(), null));
    }

}
