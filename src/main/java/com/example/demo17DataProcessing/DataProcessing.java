package com.example.demo17DataProcessing;

import com.example.RO.User;
import com.example.RO.UserRO;
import com.google.common.collect.Lists;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @auther FanYu
 * @date 2019/7/11 22:48
 */
public class DataProcessing {

    public static final List<Integer> SYSTEMLOTTERY = Lists.newArrayList(6, 8, 17, 27, 28,
            39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55);

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {

            int a = (int) Math.pow(10,i);
            int b = a * 100;
            if (a > 10000000){
                a = 10000000;
            }
            if (b > 10000000){
                b = 10000000;
            }
            list.add(b);
        }

        System.out.println(list);

    }

    private static void method() {
        System.out.println((int) 0.1);
        System.out.println((int) 0.5);
        System.out.println((int) 0.9);

        ArrayList<Integer> list = Lists.newArrayList(1,2,4, 6);
        ArrayList<UserRO> userROS = new ArrayList<>();
        AtomicInteger j = new AtomicInteger();
        int i1 ;
        for (int i = 1; i <= 10; i++) {
            UserRO userRO = new UserRO();
            if (list.contains(i)) {
                userRO.setFlag(true);
            } else {
                userRO.setFlag(false);
            }


            if (userRO.getFlag()) {
                i1 = j.get();
//                j.set(0);
            } else {
                i1 = j.getAndAdd(1);
            }

            if (i==1){
                i1 = 0;
            }
            userRO.setId((int) Math.pow(3, i1));


//            int x = 3 ^ (j);
            userROS.add(userRO);

        }

        List<Boolean> collect1 = userROS.stream().map(UserRO::getFlag).collect(Collectors.toList());
        List<Integer> collect = userROS.stream().map(UserRO::getId).collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect);


        System.out.println("=======");

        AtomicInteger atomicInteger = new AtomicInteger();
        int i = atomicInteger.get();
        System.out.println(i);

        String s = "     你好";
        System.out.println(s.length());
        String substring = s.substring(0, 2);

        if (isBlank(substring) && !isBlank(s)){
            char first= ' ';
            for (int k = 0; k < s.length(); k++) {
                if (!Character.isWhitespace(s.charAt(k))) {
                    first = s.charAt(k);
                    break;
                }
            }
            substring = first + "******";
        }
        System.out.println(substring);
    }

    public static boolean isBlank(CharSequence cs) {
        int strLen;

        if ((cs == null) || ((strLen = cs.length()) == 0))
            return true;
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }






}


