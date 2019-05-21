package com.example.demo14Sign;

import java.util.Random;

public class String_sub {

    public static void main(String[] args) {
        Random random = new Random();
        String string = "56…" + random.nextInt()*9;

        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {

            if (string.length() > 6){

                String str = string.substring(0,6) + "…";
            }



        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);




    }




}
