package com.jober.utilsservice.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormaterUtility {
    public static String DATE_FORMAT_1 = "yyyy-MM-dd HH:mm:ss";
    private static SimpleDateFormat formatter = null;
    public static String getCreationDate(Date date, String form) {
        /*LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatterLocalDateTime =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String strDate = formatterLocalDateTime.format((TemporalAccessor) date)*/;
        formatter = new SimpleDateFormat(form);
        String strDate = formatter.format(date);
        return strDate;
    }

    public static LocalDateTime getLocalDate(String date, String form) {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern(form);
        LocalDateTime lDate = LocalDateTime.parse(date,dtf);
        return lDate;
    }

    public static void main(String[] args) {
        getLocalDate((getCreationDate(new Date(), DATE_FORMAT_1)), DATE_FORMAT_1);
    }
}
