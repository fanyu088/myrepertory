package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class testNull {

    private static ThreadLocal<List> integerThreadLocal = new InheritableThreadLocal<List>() {
        @Override
        protected List initialValue() {

            String[] strings = {"2","4fd"};
            List list = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5", "6", "7"));

            ArrayList<String> strings1 = new ArrayList<>(Arrays.asList(strings));
            return list;
        }
    };


    public static void main(String[] args) {

        synchronized (testNull.class) {
            List list = integerThreadLocal.get();
            int a = 0;
            for (int i = 0; i < 10; i++) {

                list.add(""+ a++);
            }
            System.out.println(Thread.currentThread().getName() + ":" + a);
        }
    }


}





