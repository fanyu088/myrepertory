package com.example.demo9;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.example.RO.UserRO;
import com.example.RO.UserRO1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;

public class GsonAndMap {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder().create();
        List<UserRO> list = new ArrayList<>();
        list.add(new UserRO("23", "43", 2,true));
        list.add(new UserRO("23", "sdf", 1,false));
        String s = gson.toJson(list);
        System.out.println(s);

        Gson gson1 = new Gson();

        String string = "[{\"name\":\"23\",\"flag\":true},{\"name\":\"23\",\"flag\":false}]";

        Collection<UserRO1> o = gson1.fromJson(string, new TypeToken<Collection <UserRO1>>(){
        }.getType());

        Type type = new TypeToken<List<UserRO>>() {
        }.getType();

        UserRO1[] o2 = gson.fromJson(string, new TypeToken<UserRO1[]>() {
        }.getType());

        System.out.println("-=-=-=-=");
        System.out.println(Arrays.toString(o2));

        List<UserRO1> o1 = gson.fromJson(string, type);
        System.out.println("++++++++++++++++++");
        System.out.println(o1.toString());
        System.out.println(o);
    }

   /* private static void method1() {
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
*/

}
