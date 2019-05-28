package com.example.demoSQL;

import java.util.ArrayList;
import java.util.Arrays;

public class SQL_sort {

    public static void main(String[] args) {


        String str ="PC蛋蛋 一分快3 一分时时彩 三分PK10 五分PC蛋蛋 五分六合彩 五分时时彩 北京PK10 幸运28 江苏快3 竞彩足球 腾讯一分PK10 腾讯三分PK10 腾讯五分PK10 腾讯五分彩 计划";

        String[] s = str.split(" ");
        for (String s1 : s) {
            ArrayList<Integer> integers = new ArrayList<>();
            for (char c : s1.toCharArray()) {
                int a = c;
                integers.add(a);
            }
            System.out.println(s1+"------>"+integers);
        }



        String string = "腾讯五分彩";

        String string1 = "五分时时彩";

        char[] chars = string.toCharArray();
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<Integer> integers1 = new ArrayList<>();

        for (char aChar : chars) {

            int a = aChar;
            integers.add(a);

        }
        for (char c : string1.toCharArray()) {
            int b =c;
            integers1.add(b);
        }
        System.out.println(integers);
        System.out.println(integers1);


    }
}
