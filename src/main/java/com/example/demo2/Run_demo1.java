package com.example.demo2;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class Run_demo1 {

    private static Properties properties;

    private static String getProperties() {

        if (properties == null) {
            properties = new Properties();
            ClassLoader loader = Thread.currentThread().getContextClassLoader();
            try {
                properties.load(new InputStreamReader(loader.getResourceAsStream("name.properties"), StandardCharsets.UTF_8));
                return properties.getProperty("nickName");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "";
    }

//    @Value("${nickName}")
//    private static String nickName;

    private static String[] luckName = Objects.requireNonNull(getProperties()).split(",");


    public static void main(String[] args) {


        System.out.println("--------------");

        ArrayList<String> str = new ArrayList<>(Arrays.asList(luckName));
        ArrayList<Object> list = new ArrayList<>();
        Collections.shuffle(str);
        for (String s : str) {
            if (s.equals("\"没啥名取了"))
                list.add(s);
        }


        System.out.println(list);
        System.out.println(str.size());


    }
}