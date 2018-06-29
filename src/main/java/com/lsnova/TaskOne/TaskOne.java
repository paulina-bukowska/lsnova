package com.lsnova.TaskOne;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// U can use whatever you want (algorithm, endless map, API). Return day of the week for given date (input)
public class TaskOne {
    public String fetchWeekDay(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);
    }
}