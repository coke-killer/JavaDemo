package com.example.demo;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.jar.JarOutputStream;

public class LocalDateTool {
    /**
     * @param format       要转换字符串格式
     * @param localDate LocalDate时间
     * @return String
     */
    public String LocalDateToString(String format, LocalDate localDate) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(format);
        return localDate.format(pattern);
    }

    /**
     * @param format       转换格式字符串  yyyy-MM-dd
     * @param localDate LocaoDate 字符串 "2017-11-10"
     * @return LocalDate
     */

    public LocalDate StringToLocalDate(String format, String localDate) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(localDate, pattern);
    }

    /**
     * @param format
     * @param localDateTime
     * @return 将localDate 转换为String
     */

    public String LocalDateTimeToString(String format, LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern(format));
    }

    /**
     * @param format
     * @param localDateTime
     * @return String 转换为localDate
     */

    public LocalDateTime StringToLocalDateTime(String format, String localDateTime) {
        return LocalDateTime.parse(localDateTime, DateTimeFormatter.ofPattern(format));
    }

    /**
     * @param timestamp
     * @return 时间戳转换为localDateTime
     */

    public static LocalDateTime longToLocalDateTime(long timestamp) {
        Instant instant = Instant.ofEpochMilli(timestamp);
        ZoneId zoneId = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant, zoneId);
    }

    public static long LocalDateTimeToLong(LocalDateTime localDateTime) {
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = localDateTime.atZone(zoneId).toInstant();
        return instant.toEpochMilli();
    }



    public static void main(String[] args) {
        LocalDateTool localDateTool = new LocalDateTool();
//        System.out.println(localDateTool.LocalDateToString("yyyy/MM/dd", LocalDate.now()));
//        System.out.println(localDateTool.StringToLocalDate("yyyy/MM/dd", "2017/12/04"));
////        System.out.println(LocalDateTime.parse("2017/12/04 00:00:00", DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
//        System.out.println(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(localDateTool.LocalDateTimeToString("yyyy-MM-dd",LocalDateTime.now()));
        System.out.println(localDateTool.StringToLocalDateTime("yyyy-MM-dd HH:mm:ss", localDateTool.LocalDateTimeToString("yyyy-MM-dd HH:mm:ss", LocalDateTime.now())));
        System.out.println(LocalDateTool.longToLocalDateTime(1605000704000l));
        System.out.println(LocalDateTool.LocalDateTimeToLong(LocalDateTime.now()));
    }


}
