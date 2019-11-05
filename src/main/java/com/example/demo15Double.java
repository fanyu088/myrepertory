package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashSet;

public class demo15Double {
    public static void main(String[] args) {

        // 去重
        String string = "134876,128430,139606,137986,139604,133222,127188,139652,134242,128229,122807,119162,138560,138604,135136,133750,138603,139621,139300,123927,139663,123529,138892,122638,135701,133325,128253,128650,134019,132275,139705,131225,133405,139592,139273,126228,127954,135750,138066,128561,139716,138987,139637,129656,123110,120284,138950,139686,138275,137186,135701,128253,134876,133325,128430,128650,134019,132275,139606,137986,133222,139604,131225,133405,127188,139273,139592,126845,126228,127954,134242,128229,122807,137773,138066,139772,138560,128561,138604,135136,133750,138603,129656,123110,120284,122696,138950,139621,139300,123927,138275,123529,138892,139761,122638,137186,135701,128253,133325,134876,128430,128650,132275,139804,137986,139604,133222,131225,123362,122890,133405,127188,123536,139273,126845,126228,127954,134242,122807,137773,138066,119162,138560,128561,138604,134586,139637,138603,135136,133750,139835,137731,139898,129656,121791,120284,123110,122696,139300,123927,139388,138275,138892,122638,134876,128430,139606,139804,137986,139604,133222,127188,123536,123695,134242,139652,122807,119162,138560,138604,138603,133750,139898,139621,139300,123927,123529,138892,122638,135701,128253,133325,128650,134019,132275,131225,123362,133405,139592,126228,127954,139993,138066,128561,138987,137731,139637,129656,120284,129095,122696,139962,137186,134876,128430,139606,139804,139727,137986,133222,127188,123536,123695,134242,122807,119162,138560,138604,133750,135136,139898,140043,139621,123927,139300,139388,123529,122638,135701,133325,128253,128650,129101,134019,132275,131225,123362,133405,139592,139273,126228,127954,140016,139993,135750,137773,138066,128561,139637,137731,134586,129656,123110,120284,129095,122696,138950,137186,134876,128430,139727,139804,139606,137986,139604,133222,127188,123536,126845,123695,134242,122807,119162,138560,138604,135136,133750,139898,139621,139388,123927,139300,123529,122638,135701,128253,133325,134019,128650,132275,131225,123362,133405,139592,140132,126228,127954,139993,135750,137773,128561,134586,137731,139637,134026,129656,120284,123110,129095,138950,137186,134876,128430,139727,139606,139804,137986,127188,123536,126845,140234,128229,134242,138604,133750,135136,139898,139621,123927,139300,139388,118383,123529,122638,135701,133325,134019,128650,132275,131225,123362,133405,139592,126228,127954,140016,139993,137773,138066,128561,139716,138987,137731,134026,129656,123110,120284,129095,122696,137186,134876,128430,139727,139606,139804,137986,139604,127188,123536,126845,140234,134242,122807,138604,135136,133750,126913,140043,139621,139300,123927,118383,123529,138892,122638,135701,133325,134019,128650,132275,131225,123362,133405,121181,139592,126228,127954,139993,137773,138066,124726,128561,139716,139639,138987,137731,129656,120284,123110,129095,122696,137186,135701,134876,133325,128430,128650,134019,139727,132275,139804,137986,131225,139604,123362,133405,127188,121181,123536,126845,140396,126228,127954,140413,139993,134242,135750,137773,138066,124726,128561,138604,137731,133750,135136,123793,120284,123110,129095,122696,139300,123927,118383,123529,122638,134876,128430,139727,139804,137986,133222,137821,122890,127188,123536,126845,128229,134242,122807,138604,135136,133750,126913,140486,139300,123927,118383,123529,138892,122638,135701,128253,133325,128650,132275,131225,123362,133405,121181,126228,127954,140455,140413,139993,137773,138066,124726,128561,140509,137731,134586,134026,123793,120284,123110,129095,122696,135701,134876,133325,128650,128430,134019,129101,132275,139727,139804,137986,131225,139604,122890,123362,133405,127188,121181,123536,126845,126228,127954,128229,139993,139652,135750,122807,137773,138066,128561,138604,134586,137731,133750,129656,123793,123110,120284,129095,126913,140486,122696,139300,123927,118383,123529,122638,134876,128430,139727,139804,137986,139604,122890,127188,123536,140593,126845,140630,134242,122807,138604,133750,135136,128665,140486,123927,123529,118383,122638,128253,133325,128650,134019,129101,132275,131225,133289,123362,133405,121181,126228,127954,140413,139993,137773,138066,139716,137731,134586,129656,125652,120284,123110,132800,129095,130826,122696,135701,134876,133325,128253,129101,128430,134019,128650,139727,132275,137986,131225,133289,123362,127188,133405,127682,121181,123536,126845,126228,127954,140697,140413,134242,139993,128229,122807,138066,138604,139716,135136,134586,137731,133750,128665,125652,120284,123110,129095,126363,126913,140486,122696,123927,123529,118383,122638,135701,133325,134876,134019,129101,128430,128650,139804,139727,137986,131225,123362,133405,127188,126228,127954,126887,128229,139993,134242,122807,137773,138066,128429,140758,128561,138604,137731,134586,133750,135136,129656,123110,129095,140486,122696,123927,139388,123529,118383,122638,135701,128253,134876,129101,128650,132275,139727,139804,137986,131225,133405,121181,123536,126228,127954,140831,139993,122807,137773,128429,138066,128561,138604,134586,137731,133750,135136,129656,123110,120284,129095,140486,122696,139388,123927,139300,118383,123529,122638,135701,134876,140916,129101,128650,128430,132275,139727,139804,137986,131225,123362,133405,128590,127682,121181,126845,126228,127954,134242,139993,122807,137773,138066,136141,128561,138604,134586,133750,137731,135136,129656,123793,120284,123110,126913,140880,122696,139388,139300,123927,118383,123529,138892,122638,135701,134876,128253,128430,129101,128650,139727,132275,139804,137986,131225,132516,122890,133405,127188,128590,121181,126845,126228,127954,139993,134242,122807,138066,128561,138604,133750,134586,137731,135136,129656,123793,123110,120284,129095,126913,122696,139388,139300,123927,118383,138892,122638,135701,134876,128650,129101,139727,132275,139804,137986,133222,131225,122890,123362,133405,128590,127682,121181,126845,126228,127954,134242,139993,128229,122807,137773,138066,135415,128561,138604,134586,137731,133750,129656,123793,123110,120284,129095,126913,140486,122696,123927,139388,118383,123529,138892,122638,135701,134876,129101,128650,128430,139727,132275,137986,131225,139604,123362,122890,133405,127188,126845,126228,127954,139993,134242,128229,122807,137773,138066,128561,138604,139716,134586,135136,137731,133750,129656,123793,120284,123110,129095,122696,141136,139388,123927,139300,118383,123529,122638,135701,134876,128430,129101,128650,139727,132275,139804,137986,139604,131225,122890,123362,133405,127188,127682,128590,121181,126228,127954,140697,139993,134242,122807,137773,138066,128561,138604,138987,134586,137731,133750,134026,129656,123793,123110,129095,126913,141214,122696,139388,123927,141218,118383,122638,135701,134876,129101,128650,139727,132275,139804,137986,131225,122890,123362,133405,128590,127682,141284,126845,126228,127954,139993,134242,122807,137773,141305,138066,135415,128561,138604,137731,133750,134586,139637,134026,129656,123110,129095,126913,140486,122696,139300,139388,123927,123529,122638,135701,134876,129101,128650,139727,132275,139804,137986,131225,139604,123362,133405,128590,127682,121181,141384,126228,127954,141321,141369,139993,134242,122807,137773,138066,128561,138604,128662,134586,137731,133750,135015,123110,132800,129095,141282,141377,140486,122696,139388,123927,139488,123529,138892,122638,135701,134876,128253,129101,128650,132275,139804,137986,131225,123362,133405,128590,141392,126228,141421,141321,127954,140413,139993,134242,137773,122807,138066,128561,138604,137731,134586,133750,129656,132800,123110,120284,129095,141381,141282,140486,122696,139388,123927,139488,123529,122638,135701,134876,128253,129101,128650,132275,139804,137986,131225,123362,122890,133405,128590,141392,139273,126228,141520,127954,141321,141369,134242,139993,137773,122807,128561,138604,137731,133750,134026,129656,120284,132800,129095,122696,139388,123927,122638,135701,134876,128253,133325,128650,129101,132275,139804,137986,131225,133222,123362,133405,128590,127682,123536,126228,127954,141321,134242,128229,139993,135750,137773,139473,128561,138604,133750,137731,129656,132800,120284,123110,129095,141650,141630,122696,138950,123927,141635,123529,141616,122638,135701,134876,128253,128650,129101,132275,137986,131225,123362,133405,128590,127682,141392,126228,141641,141321,127954,134242,139993,141702,137773,124726,128561,138604,137731,133750,129656,123110,132800,120284,141650,141630,141673,122696,123927,118383,123529,141616,141714,122638,135701,134876,129101,128650,128430,132275,139804,131225,123362,133405,127188,128590,127682,141780,126228,141641,141321,127954,141885,139993,134242,137773,122807,124726,128561,138604,137731,133750,129656,132800,120284,141650,141673,123927,141812,118383,123529,141714,138892,135701,134876,128650,129101,139804,137986,131225,123362,127188,133405,126228,141641,141321,127954,139993,134242,137773,128561,138604,133750,137731,132800,141650,141873,123927,118383,123529,141937,141936,135701,134876,128650,129101,134019,128430,139804,132275,137986,131225,139604,133405,127188,141780,123536,132819,126228,127954,141321,139993,134242,137773,128561,138604,137731,133750,138603,134586,129656,132800,120284,142065,141650,141630,141873,141898,142107,118383,141937,135701,134876,128650,129101,134019,139804,132275,137986,131225,123362,133405,123536,141780,142134,142178,126228,127954,142135,139993,134242,135750,137773,122807,128561,138604,137731,134586,133750,138603,134026,129656,132800,120284,123110,126363,141650,140486,141873,142107,141898,123927,139388,122638";
        String[] split = string.split(",");
        HashSet<String> strings = new HashSet<>();
        strings.addAll(Arrays.asList(split));

        System.out.println(strings.size());

    }

    private static void method4() {
        int i = 2;
        double d = 2.34464;
        double d1 = 2.35;
        double d2 = 2.35;


        System.out.println(i < d);
        System.out.println(d1>d);

        d1 = i;
        System.out.println(d1);

        double v = d%1;
        System.out.println(v);
        System.out.println(d1==d2);
        System.out.println(d1>d2);
        System.out.println(d1<d2);


        System.out.println(method(2.5654));
        double d3 = i;

        System.out.println(method1(d3));

        System.out.println(
                "====================================="
        );
        int min = 2 ;
        int max = 200;
        double dmin = 2.0;
        double dmin1 = 2.00;

        double dmax = 200.0;
        double dmax1 = 200.00;

        System.out.println(min>dmin1);
        System.out.println(min==dmin1);
        System.out.println(min<dmin1);

        System.out.println(dmin1>min);
        System.out.println(dmin1==min);
        System.out.println(dmin1<min);

        System.out.println("------------------");

        double sum_double = 2.0000;

        BigDecimal bigDecimal = new BigDecimal(sum_double);
        String string = String.valueOf(sum_double);
        System.out.println(string);
        System.out.println(bigDecimal);
        System.out.println(bigDecimal.toString());
        System.out.println(""+bigDecimal);


        System.out.println("**********************");
        BigDecimal bg = BigDecimal.valueOf(2.0010000);

        BigDecimal bigDecimal1 = bg.setScale(2, RoundingMode.UP);
        double num = bigDecimal1.doubleValue();
        if (Math.round(num) - num == 0) {
            System.out.println(String.valueOf((long) num));
        }
        System.out.println(String.valueOf(num));
    }

    private static  int method1(double number){
        String s = String.valueOf(number);

        return s.substring(s.lastIndexOf(".")+1).length();


    }





    private static  int method(double number){
        if (number == (long)number) {
            return 0;
        }
        int i = 0;
        while (true){
            i++;
            if (number * Math.pow(10, i) % 1 == 0) {
                return i;
            }
        }
    }
}
