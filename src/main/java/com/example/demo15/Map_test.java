package com.example.demo15;

import com.example.RO.UserRO;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Map_test {

    public static void main(String[] args) {

        Map<String, UserRO> map = Maps.newConcurrentMap();

        map.put("a",new UserRO("23", "43", 2,true));
        map.put("c",new UserRO("23", "43", 2,false));
        map.put("b",new UserRO("24", "43", 2,true));
        map.put("d",new UserRO("23", "43", 2,false));
        map.put("e",new UserRO("25", "43", 2,true));


        map.put("22",new UserRO());
        System.out.println(map);
//        System.out.println(map.get("22"));

        HashMap<String, String> stringStringHashMap = new HashMap<>();

        stringStringHashMap.put("11","11");
        stringStringHashMap.put("22","");
        stringStringHashMap.put("33"," ");
        stringStringHashMap.put("44",null);
        System.out.println(stringStringHashMap.get("44"));

        System.out.println(stringStringHashMap);

    }

}
