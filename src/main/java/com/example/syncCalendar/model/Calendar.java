package com.example.syncCalendar.model;

import lombok.*;

@Data
@Builder
public class Calendar {
    private String description;
    @NonNull
    private int day;
}
