package com.example.demo18HotMore.demo17DataProcessing;

import java.util.*;

/**
 * @auther FanYu
 * @date 2019/7/31 9:59
 */
public class Statistical {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("12", "12", "23", "23", "23", "12", "23", "12", "45");
        List<Map> maps = statisticalCount(list);
        System.out.println(maps);

    }

    private static List<Map> statisticalCount(List<String> list) {

        if (list.isEmpty()) {
            return null;
        }
        HashMap<String, Integer> stringStringHashMap = new HashMap<>();
        for (String s : list) {
            Integer count = stringStringHashMap.get(s);
            stringStringHashMap.put(s, count == null ? 1 : count + 1);
        }
        ArrayList<Map> maps = new ArrayList<>();
        Set<String> strings = stringStringHashMap.keySet();
        for (String string : strings) {
            HashMap<String, String> map = new HashMap<>();
            map.put("chatId",string);
            map.put("count",stringStringHashMap.get(string).toString());
            maps.add(map);
        }



        return maps;


    }


}
