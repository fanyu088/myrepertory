package com.example.demo15;

import com.google.common.collect.Lists;

import java.util.List;

public class compare {

    public static void main(String[] args) {
        int number = 0x00000001;
        int number1 = 0x00000002;
        int number2 = 0x00000004;
        int number3 = 0x00000008;
        int number4 = 0x00000020;
        int number5 = 0x00000040;
        int number6 = 0x00000080;
        int number7 = 0x00000100;
        int number8 = 0x00000001;
        System.out.println(number);

        int authority =251;

        System.out.println("========");
//        System.out.println(number+","+);


        List<Integer> method = method(authority);
        System.out.println(method);
        double sum = method.stream().filter(s -> s > 0).mapToDouble(Integer::doubleValue).sum();
        System.out.println(sum);


    }

    private static List<Integer> method(int authority) {
        List<Integer> ret = Lists.newArrayList();
        for (int i = 0; i < 8; i++) {
            int a = 1 << i;
            if ((authority & (a)) == a) {
                System.out.print(a+"--");
                ret.add(a);
            }
        }
        System.out.println();
        return ret;
    }
}
