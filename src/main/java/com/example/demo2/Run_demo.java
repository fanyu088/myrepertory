package com.example.demo2;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Run_demo {


    public static void main(String[] args) {

        String[] demo1 = new Demo1().demo1;

        String[] demo2 = new Demo2().demo2;

        String[] demo3 = new Demo3().demo3;

        String[] demo4 = new Demo4().demo4;

        Set set = new HashSet();


        for (int i = 0; i < demo1.length; i++) {
            String str = demo1[i];
            // 第一种 拿出符合规定的字符然后拼接返回字符串
            String regEx = "[a-zA-Z0-9\\u4e00-\\u9fa5]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            StringBuilder sb = new StringBuilder();
            while (m.find()) {
                sb.append(m.group());
            }

            if (sb.toString() != null && !"".equals(sb.toString())) {
                set.add(sb.toString());
            }

        }

        for (int i = 0; i < demo2.length; i++) {
            String str = demo2[i];
            // 第一种 拿出符合规定的字符然后拼接返回字符串
            String regEx = "[a-zA-Z0-9\\u4e00-\\u9fa5]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            StringBuilder sb = new StringBuilder();
            while (m.find()) {
                sb.append(m.group());
            }

            if (sb.toString() != null && !"".equals(sb.toString())) {
                set.add( sb.toString());
            }

        }

        for (int i = 0; i < demo3.length; i++) {
            String str = demo3[i];
            // 第一种 拿出符合规定的字符然后拼接返回字符串
            String regEx = "[a-zA-Z0-9\\u4e00-\\u9fa5]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            StringBuilder sb = new StringBuilder();
            while (m.find()) {
                sb.append(m.group());
            }

            if (sb.toString() != null && !"".equals(sb.toString())) {
                set.add(sb.toString());
            }

        }

        for (int i = 0; i < demo4.length; i++) {
            String str = demo4[i];
            // 第一种 拿出符合规定的字符然后拼接返回字符串
            String regEx = "[a-zA-Z0-9\\u4e00-\\u9fa5]";
            Pattern p = Pattern.compile(regEx);
            Matcher m = p.matcher(str);
            StringBuilder sb = new StringBuilder();
            while (m.find()) {
                sb.append(m.group());
            }

            if (sb.toString() != null && !"".equals(sb.toString())) {
                set.add(sb.toString());
            }

        }

        System.out.println(set);
        System.out.println(set.size());
    }
}