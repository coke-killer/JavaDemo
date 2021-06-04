package com.example.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.get(ChronoField.AMPM_OF_DAY));
//        switch (now.get(ChronoField.AMPM_OF_DAY)) {
//            case 0:
//                System.out.println("上午");
//            case 1:
//                System.out.println("下午");
//        }
        //当前月份得有第一天
//        System.out.println(now.with(TemporalAdjusters.firstDayOfMonth()));
//        //下一个月份得第一天
//        System.out.println(now.with(TemporalAdjusters.firstDayOfNextMonth()));
//        //当前月份你的最后一天，再也不用计算是28，29，30，还是31
//        System.out.println(now.with(TemporalAdjusters.lastDayOfMonth()));
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("G yyyy年MM月dd号 E a hh时mm分ss秒");
//        String format = simpleDateFormat.format(new Date());
//        System.out.println(format);
//        //jdk 8
//        LocalDateTime now1 = LocalDateTime.now();
//        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String format1 = now1.format(pattern1);
//        System.out.println(format1);
//        //String转换Date
////        try {
////            SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
////            Date parse = simpleDateFormat1.parse("2017-12-03 10:00:00");
////            System.out.println(parse);
////        } catch (ParseException e) {
////            e.printStackTrace();
////        }
//        //jdk8
//        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        LocalDateTime parse = LocalDateTime.parse("2017-12-03 10:00:00", pattern);
//        System.out.println(parse.format(pattern));
//LocalDate 转换为String
        LocalDate now1 = LocalDate.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = now1.format(pattern);
        System.out.println(format);
        LocalDate parse = LocalDate.parse(format, pattern);
        System.out.println(parse);


    }

}
