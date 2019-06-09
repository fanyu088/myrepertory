package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class demo15Double {
    public static void main(String[] args) {

        int i = 2;
        double d = 2.34464;
        double d1 = 2.35;
        double d2 = 2.35;


        System.out.println(i < d);
        System.out.println(d1>d);

        d1 = i;
        System.out.println(d1);

        double v = d%1;
        System.out.println(v);
        System.out.println(d1==d2);
        System.out.println(d1>d2);
        System.out.println(d1<d2);


        System.out.println(method(2.5654));
        double d3 = i;

        System.out.println(method1(d3));

        System.out.println(
                "====================================="
        );
        int min = 2 ;
        int max = 200;
        double dmin = 2.0;
        double dmin1 = 2.00;

        double dmax = 200.0;
        double dmax1 = 200.00;

        System.out.println(min>dmin1);
        System.out.println(min==dmin1);
        System.out.println(min<dmin1);

        System.out.println(dmin1>min);
        System.out.println(dmin1==min);
        System.out.println(dmin1<min);

        System.out.println("------------------");

        double sum_double = 2.0000;

        BigDecimal bigDecimal = new BigDecimal(sum_double);
        String string = String.valueOf(sum_double);
        System.out.println(string);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.toString());
        System.out.println(""+bigDecimal);


        System.out.println("**********************");
        BigDecimal bg = BigDecimal.valueOf(2.0010000);

        BigDecimal bigDecimal1 = bg.setScale(2, RoundingMode.UP);
        double num = bigDecimal1.doubleValue();
        if (Math.round(num) - num == 0) {
            System.out.println(String.valueOf((long) num));
        }
        System.out.println(String.valueOf(num));



    }
    private static  int method1(double number){
        String s = String.valueOf(number);

        return s.substring(s.lastIndexOf(".")+1).length();


    }





    private static  int method(double number){
        if (number == (long)number) {
            return 0;
        }
        int i = 0;
        while (true){
            i++;
            if (number * Math.pow(10, i) % 1 == 0) {
                return i;
            }
        }
    }
}
