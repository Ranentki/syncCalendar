package com.example.syncCalendar.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
public class Calendar {
    private String description;
    private int day;

    public Calendar(@JsonProperty("day") int day, @JsonProperty("description") String description){
        this.day = day;
        this.description = description;
    }
}
