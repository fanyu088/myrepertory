package com.example.demo2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Properties;

public class Run_demo1 {

    private static Properties properties;
    private static String getProperties() {

        if (properties == null) {
            properties = new Properties();
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            try {
                properties.load(new InputStreamReader(loader.getResourceAsStream("demo.properties"), "UTF-8"));
                return properties.getProperty("luck_Name");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private static String[] luckName = getProperties().split(",");


    public static void main(String[] args) {


        System.out.println(Arrays.toString(luckName));
        System.out.println(luckName.length);

    }
}