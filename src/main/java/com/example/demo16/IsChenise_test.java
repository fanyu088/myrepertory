package com.example.demo16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @auther FanYu
 * @date 2019/6/10 17:04
 */
public class IsChenise_test {
    public static void main(String[] args) {


        boolean chinese = isChinese(" ");
        System.out.println(chinese);


    }

    public static boolean isChinese(String str) {
        String regEx = "[\u4e00-\u9fa5]";
        Pattern pat = Pattern.compile(regEx);
        Matcher matcher = pat.matcher(str);
        boolean flg = false;
        if (matcher.find()) {
            flg = true;
        }
        return flg;
    }

}
