package com.example.demo10;

public class SubString_Str {

    public static void main(String[] args) {

        String str = "kjlsdjfols;djlsd;djksf;";

        int index = str.indexOf(";");



        String substring = str.substring(0, index);

        System.out.println(index);

        System.out.println(substring);




    }
}
