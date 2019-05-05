package com.example.demo10;

public class NanoTime_test {
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {

            System.out.println(System.nanoTime());
        }
        Thread.sleep(2000);
        System.out.println("-----------------------------------");

        for (int i = 0; i < 10; i++) {

            System.out.println(System.nanoTime());
        }


    }
}
