package com.yixin.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTest {
    @Test
    public void LocalTest(){
        LocalDate localDate = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(now);
        System.out.println(now1);
    }
}
