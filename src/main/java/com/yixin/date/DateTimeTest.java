package com.yixin.date;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @Package: com.yixin.date
 * @ClassName: DateTimeTest
 * @Description: util.date与sql.date区别
 * @Author: 式神
 * @CreateDate: 2019/11/5 14:36
 */
public class DateTimeTest {
    @Test
    public void test1() {
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1);
        Date date2 = new Date(1572936392286L);
        System.out.println(date2);
    }

    @Test
    public void test2() {
        java.sql.Date date2 = new java.sql.Date(1572936392286L);
        System.out.println(date2.toLocalDate());
    }

    @Test
    public String test3(String str, int index, int end) {
        StringBuilder builder = new StringBuilder(str.length());
        builder.append(str.substring(0, index));
        for (int i = end; i >= index; i--) {
            builder.append(str.charAt(i));
        }
        builder.append(str.substring(end + 1));
        return builder.toString();
    }
    @Test
    public void LocalDateTest(){
        LocalDate localDate = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(now);
        System.out.println(now1);
    }
     public static void main(String[] args) {
        DateTimeTest dateTimeTest = new DateTimeTest();
        String a = dateTimeTest.test3("1abcd", 1, 3);
        System.out.println(a);
    }

}
