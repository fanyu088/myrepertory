package com.example.demo15;

import com.example.RO.UserRO;

import java.util.ArrayList;

public class Boolean_test {
    public static void main(String[] args) {


      /*  UserRO userRO = new UserRO();
        String string ="sdfsdf,true";
        userRO.setAdress(string);
        UserRO method = Assert_test.method(userRO);

        System.out.println(method);

        ArrayList<Object> objects = new ArrayList<>();
        objects =null;
        System.out.println(objects==null);
        System.out.println(objects.isEmpty());

*/
        System.out.println(382 & 128);

        String string = "红包消息";
        char[] chars = string.toCharArray();
        ArrayList<String> objects = new ArrayList<>();

        String a ;
        int b;
        for (char s : chars) {
            b = s ;

            String string1 = Integer.toHexString(b);
            System.out.print("\\u"+string1);
            objects.add(string1);
        }
        System.out.println();
        System.out.println(objects);

    }


}
