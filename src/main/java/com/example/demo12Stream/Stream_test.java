package com.example.demo12Stream;

import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_test {
    public static void main(String[] args) {

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        objectObjectHashMap.put(1, "a");
        objectObjectHashMap.put(2, "b");
        objectObjectHashMap.put(3, "c");
        objectObjectHashMap.put(4, "d");
        objectObjectHashMap.put(5, "e");

        System.out.println(objectObjectHashMap.keySet().stream().map(s -> s.toString()).sorted().collect(Collectors.toList()));

        objectObjectHashMap.forEach((Object a, Object b) -> System.out.println(a + "-->" + b));

        Stream stream = Stream.of();
        System.out.println("__________________________----------------____________________________");

    }

}
