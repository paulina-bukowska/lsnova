package com.lsnova.TaskOne;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class TaskOneTestSuite {
    TaskOne taskOne = new TaskOne();

    @Test
    public void shouldFetchWeekDay() {
        //Given
        LocalDate date1 = LocalDate.of(2018, 06, 29);
        LocalDate date2 = LocalDate.of(2015, 01, 8);
        LocalDate date3 = LocalDate.of(1996, 11, 17);

        // When
        String friday = taskOne.fetchWeekDay(date1);
        String thursday = taskOne.fetchWeekDay(date2);
        String sunday = taskOne.fetchWeekDay(date3);

        // Then
        Assert.assertEquals("Friday", friday);
        Assert.assertEquals("Thursday", thursday);
        Assert.assertEquals("Sunday", sunday);
    }
}