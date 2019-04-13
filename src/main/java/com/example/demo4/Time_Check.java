package com.example.demo4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time_Check {
    public static void main(String[] args) {

        SimpleDateFormat sim = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date parse = sim.parse("2019-01-12");
            System.out.println(parse);
            long time = parse.getTime();
            int timeI = (int) time;

            System.out.println(time);
            String s = String.valueOf(time);


            String se = String.valueOf(time + 1000 * 60 * 60 * 24 - 1000);
            int seI = (int) (time + 1000 * 60 * 60 * 24 - 1000);
            int seI1 = timeI + 1000 * 60 * 60 * 24 - 1000;


            System.out.println(time);
            System.out.println(timeI);

            System.out.println("-----------");

            System.out.println(seI);
            System.out.println(seI1);

            System.out.println(se);
            System.out.println("-----------");
            System.out.println(time);
            System.out.println(time + 1000 * 60 * 60 * 24 - 1000);


        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
