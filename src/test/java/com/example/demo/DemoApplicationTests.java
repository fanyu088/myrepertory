package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {

        System.out.println("1");
    }

    @Test
    public void testArrayList() {

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            List<String> list = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                list.add(String.valueOf(i));
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");

        long starTimeTwo = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            List<String> list = new ArrayList<>(Arrays.asList(
                    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));

        }
        long endTimeTwo = System.currentTimeMillis();

        System.out.println(endTimeTwo-starTimeTwo);

        System.out.println("ceshi");

    }

}
