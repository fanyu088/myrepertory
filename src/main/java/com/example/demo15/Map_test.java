package com.example.demo15;

import com.example.RO.UserRO;
import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

public class Map_test {

    public static void main(String[] args) {

        Map<String, UserRO> map = Maps.newConcurrentMap();

        map.put("a",new UserRO("23", "43", 2,true));
        map.put("c",new UserRO("23", "43", 2,false));
        map.put("b",new UserRO("24", "43", 2,true));
        map.put("d",new UserRO("23", "43", 2,false));
        map.put("e",new UserRO("25", "43", 2,true));

        System.out.println(map);

    }

}
