package com.example.demo13Calc;

import jdk.nashorn.internal.runtime.linker.LinkerCallSite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Random_test {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
       /* for (int i = 0; i < 20; i++) {
            int a = (int) (Math.random()*(10-2) +3);
            list.add(a);
        }*/

        System.out.println(list.size());
        System.out.println(list);
    }

    private static void method2() {
        Random random = new Random();
        int start = 10;
        int index = 0;
        int tempCode = 0;
        int size = 10;

        // 生成所有期数
        int[] issue = new int[size];
        for (int i = 0; i < size; i++){
            issue[i] = i + start;
        }

        System.out.println(Arrays.toString(issue));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + start);
        }
        System.out.println(list);
        Collections.shuffle(list);


        System.out.println(list);


        int a= 10;
        double b = 0.65;
        int c = (int) (a* b);
        System.out.println(c);
    }

    private static void method1() {
        int i = 2;
        int max = 0;
        int min = 0;
        int v;          // 0为盈利1为亏损

        int init = 2;   // 第一次投注
        int num = 4;    // 最大投注次数
        int ratio = 3;  // 增长倍率

        int win = 0;    // 盈利
        int lose = 0;   // 亏损

        for (int j = 0; j < 10; j++) {

            for (int k = 1; k <= num; k++) {

                v = (int) (Math.random() * i);
                if (v == 0) {
                    win += init * k * ratio ;
                    min++;
                }
                if (v == 1) {
                    lose += init * k * ratio ;
                    max++;
                }

            }


        }

        System.out.println("win:" + win + " , lose:" +lose);
        System.out.println("max:" + max + " , min:" + min);
    }
}
