package com.example.demo15;

import com.google.common.collect.Lists;

import java.util.List;

public class Shift_operator {
    public static void main(String[] args) {

        int sum = 100;
        method(sum);

        int sum_right = sum >> 1;
        method(sum_right);

        int sum_left = sum << 1;
        method(sum_left);

        List<Integer> contains = contains(sum);
        System.out.println(contains);

        int number = sum & 8 ;

        System.out.println(number);
    }

    private static List<Integer> contains(int authority){
        List<Integer> ret = Lists.newArrayList();
        for (int i = 0; i < 8; i++) {
            int a = 1 << i;
            if ((authority & (a)) == a) ret.add(a);
        }
        return ret;
    }

    private static void method(int sum){

        System.out.println(Integer.toBinaryString(sum));
        System.out.println(sum);
    }
}
