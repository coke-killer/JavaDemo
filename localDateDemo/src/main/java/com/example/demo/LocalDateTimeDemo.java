package com.example.demo;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //此类默认格式为2017-01-01T01:01:01.555
//        LocalDateTime now = LocalDateTime.now();
//        //获取当前时间字符串
//        System.out.println(now.toString());
//        //获取当前年份
//        System.out.println(now.getYear());
//        //获取当前时间得月份英文
//        System.out.println(now.getMonth());
//        //获取当前月份数值
//        System.out.println(now.getMonthValue());
//        //获取当前天数
//        System.out.println(now.getDayOfMonth());
//        //获取当前小时数
//        System.out.println(now.getHour());
//        //获取分钟数
//        System.out.println(now.getMinute());
//        //获取秒数
//        System.out.println(now.getSecond());
//        //获取毫秒数补充6个0
//        System.out.println(now.getNano());
        //自定义时间
//        LocalDateTime time = LocalDateTime.of(2010, 11, 9, 1, 1, 1);
//        System.out.println(time);
        //使用plus方法增加年份
//        LocalDateTime time1 = LocalDateTime.of(2020, 11, 9, 1, 1, 1);
//        //改变事件后返回一个新的实例nextYearTime
//        LocalDateTime time2 = time1.plusYears(1);
//        System.out.println(time2);
//        //使用minus减少时间
//        LocalDateTime time3 = time2.minusYears(1);
//        System.out.println(time3);
        //使用with方法设置月份,返回一个新对象
//        LocalDateTime time = LocalDateTime.of(2020, 1, 1, 1, 1, 1);
//        LocalDateTime time2 = time.withMonth(12);
//        System.out.println(time2);
        //判断当前星期几
        DayOfWeek dayOfWeek = LocalDateTime.now().getDayOfWeek();
        int dayOfMonth = LocalDateTime.now().getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);

    }
}
