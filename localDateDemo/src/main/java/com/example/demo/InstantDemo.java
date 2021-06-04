package com.example.demo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class InstantDemo {
    public static void main(String[] args) {
//        Instant now = Instant.now();
//        //获取毫秒是
//        System.out.println(now.toEpochMilli());
//        //判断是否在参数之前
//        System.out.println(now.isAfter(now));
//        //判断是否在参数之后
//        System.out.println(now.isBefore(now));
//        //当前时间与参数中得时间进行对比之前，相同之后，分别是（-1，0，1）
//        System.out.println(now.compareTo(now));
//        //用一个时间戳去创建一个Date实例
//        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
//        System.out.println(instant.getEpochSecond());
//        //获取得秒
//        System.out.println(now.getEpochSecond());
        //Instant 转LocalDateTime
        Instant instant = Instant.ofEpochMilli(System.currentTimeMillis());
        System.out.println(instant);
        ZoneId systemDefault = ZoneId.systemDefault();
        LocalDateTime now = LocalDateTime.ofInstant(instant, systemDefault);
        System.out.println(now);
        //LocalDateTime 转Instance
        LocalDateTime now1 = LocalDateTime.now();
        System.out.println(now1);
        ZoneId systemDefault1 = ZoneId.systemDefault();
        Instant instant1 = now.atZone(systemDefault1).toInstant();
        System.out.println(instant1);
        System.out.println(instant1.toEpochMilli());
    }
}
