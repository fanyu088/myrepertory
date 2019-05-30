package com.example.demo15;

import org.springframework.util.StringUtils;

import java.util.Arrays;

public class Split_test {
    public static void main(String[] args) {


        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("以下房间分享失败").append("\n");
        stringBuilder.append("1以下房间分享失败").append("\n");
        stringBuilder.append("2以下房间分享失败").append("\n");


        System.out.println(stringBuilder.toString().length());
        boolean empty = StringUtils.isEmpty(stringBuilder.toString().substring(9));
        System.out.println(empty);
        System.out.println(stringBuilder.toString());


    }

    private static void method() {
        String string = "lao,pen,lao,jao,lao";
        String str = "lao";


        String[] split = string.split(",");
        for (String s : split) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(split));

        System.out.println("---------------------");
        String[] split1 = str.split(",");
        for (String s : split1) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(split1));
    }
}
