package com.example.demo15;

import com.example.RO.UserRO;

import java.util.ArrayList;

public class Boolean_test {
    public static void main(String[] args) {


        UserRO userRO = new UserRO();
        String string ="sdfsdf,true";
        userRO.setAdress(string);
        UserRO method = Assert_test.method(userRO);

        System.out.println(method);

        ArrayList<Object> objects = new ArrayList<>();

        System.out.println(objects==null);
        System.out.println(objects.isEmpty());


    }


}
