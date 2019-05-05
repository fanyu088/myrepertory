package com.example.demo13Calc;

public class Nanotime_test_test {

    public static void main(String[] args) throws InterruptedException {

        method1();


    }

    private static void method2() {
        long l = System.nanoTime();
        String s=String.valueOf(l);

        String substring = s.substring(0, s.length() - 3);

        System.out.println(s);
        System.out.println(substring);
    }

    private static void method1() throws InterruptedException {
        long s = System.nanoTime();
        Thread.sleep(3000);
        long e = System.nanoTime();

        System.out.println(s);
        System.out.println(e);

        System.out.println(e-s);
        System.out.println(e-s);
        System.out.println(1);
    }


}
