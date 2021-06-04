package com.example.demo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2017, 1, 1, 1, 1, 1);
        LocalDateTime time2 = LocalDateTime.of(2020, 10, 1,2,2,2);
        Duration result = Duration.between(time, time2);
        System.out.println(result.toDays());
        System.out.println(result.toHours());
        System.out.println(result.toMinutes());
        System.out.println(result.toMillis());
        System.out.println(result.toNanos());
    }
}
