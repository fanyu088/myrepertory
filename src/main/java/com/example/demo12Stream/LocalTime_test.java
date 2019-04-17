package com.example.demo12Stream;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTime_test {

    public static void main(String[] args) {

        LocalTime now = LocalTime.now();
        LocalDateTime now1 = LocalDateTime.now();

        LocalDateTime dataTime = LocalDateTime.of(LocalDate.now(),LocalTime.now().plusSeconds(120));
        long l = System.currentTimeMillis();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String format1 = simpleDateFormat.format(l);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String format = dataTime.format(dateTimeFormatter);


        System.out.println(dataTime);
        System.out.println(format);
        System.out.println(format1);


    }


}
