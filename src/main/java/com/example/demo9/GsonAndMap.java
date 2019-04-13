package com.example.demo9;

import com.example.RO.UserRO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GsonAndMap {

    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();
        map.put("MSG", "{\"qw\":\"frf\",\"fd\":\"fdf\"}");

        UserRO userRO = new UserRO("kd", "d", 3);
        map.put("user", userRO);

        List<UserRO> list = new ArrayList<>();
        list.add(new UserRO("23", "43", 2));
        list.add(new UserRO("23", "sdf", 1));
        map.put("list", list);


        Gson gson = new GsonBuilder().create();

        String s1 = gson.toJson(map);

        Map<String, Object> MA = gson.fromJson(s1, new TypeToken<Map<String, Object>>() {
        }.getType());


        System.out.println(MA);
        System.out.println("----------------------------------------------");

        for (String s : map.keySet()) {
            System.out.println("key:" + s + "-->" + map.get(s));
        }

//        String user = gson.toJson(MA.get("user"));//都可以
        String user = MA.get("user").toString();
        UserRO userRO1 = gson.fromJson(user, UserRO.class);//直接强转报错
        System.out.println(userRO1.getId());



    }


}
