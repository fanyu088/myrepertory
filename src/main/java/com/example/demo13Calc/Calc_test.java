package com.example.demo13Calc;

import java.time.LocalTime;

public class Calc_test {
    public static void main(String[] args) {

        int numberOne = 123 ;
        int numberTwo = 456 ;

        String stringOne = Integer.toBinaryString(numberOne);
        String stringTwo = Integer.toBinaryString(numberTwo);

        int result1 = numberOne | numberTwo;
        int result2 = numberOne & numberTwo;
        int result3 = numberOne ^ numberTwo;
        int result4 = ~ numberOne;

        System.out.println(stringOne);
        System.out.println(stringTwo);
        System.out.println("------------------");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        boolean b = ((0 & 0x00000002) == 0x00000002);
        boolean c = ((226 & 0x00000002) == 0x00000002);
        int a =0x00000002;
        System.out.println(a);

        System.out.println("=========");
        System.out.println(b);
        System.out.println(c);

        System.out.println("-=-=-=-=-=-=-=-");
        System.out.println(10/3);
        System.out.println(10%3);
        System.out.println(LocalTime.now());

    }
}
