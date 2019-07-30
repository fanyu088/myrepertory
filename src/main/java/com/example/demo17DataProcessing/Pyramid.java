package com.example.demo17DataProcessing;

import com.google.common.collect.Lists;
import javolution.lang.MathLib;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther FanYu
 * @date 2019/7/18 19:35
 */
public class Pyramid {

    public static void main(String[] args) {
        ArrayList<Integer> pyramidList = getPyramidList(2, 7, 5);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(pyramidList.get(i));
        }
        System.out.println(list);

       /* int a = 3* 100/35  +4 * 100/35 +5 * 100/35 +6 * 100/35 ;
        System.out.println(a);*/
    }

    private static void method2() {
        int b = 0;
        for (int i = 0; i < 6; i++) {
            int a = 100 * (i + 1) / (7 * 3);
            b += a;
            if (i == 6) {
                a = 100 - b;
            }
            System.out.println(a);
        }
        System.out.println(b);


        System.out.println("*******************");

        int[] ints = new int[30];
        Arrays.fill(ints, 0, 10, 1);
        Arrays.fill(ints, 10, 20, 2);
        Arrays.fill(ints, 20, 30, 3);
        System.out.println(Arrays.toString(ints));

        System.out.println("*******************");

        // 金字塔等级集合
        int number = 30;
        int lobbyFansMaxLevel = 6;
        int roomFansMaxLevel = 7;
        ArrayList<Integer> lobbyPyramidList = getPyramidList(lobbyFansMaxLevel, number);
        ArrayList<Integer> roomPyramidList = getPyramidList(roomFansMaxLevel, number);

        System.out.println(lobbyPyramidList);
        System.out.println("=====");

        System.out.println(roomPyramidList);
        System.out.println(Math.pow(3, 12));
        System.out.println(Math.pow(3, 4));


        System.out.println(Math.pow(Math.pow(3, 4), 1.0 / 3.0));
        System.out.println(MathLib.pow(MathLib.pow(3, 4), 1.0 / 3.0));

        int a = (int) Math.pow(3, 4) & 3;
        System.out.println(a);
    }

    private static ArrayList<Integer> getPyramidList(int MaxLevel, int number) {

        Integer[] ints = new Integer[number];
        // 等差和
        int lobbySum = (1 + MaxLevel) * MaxLevel / 2;
        // 自增
        AtomicInteger atomicInteger = new AtomicInteger();
        int k;
        int i;
        for (i = MaxLevel, k = 1; i > 0; i--, k++) {
            if (i != 1) {
                Arrays.fill(ints, atomicInteger.getAndAdd((int) ((double) k / (double) lobbySum * number)), atomicInteger.get(), i);
            } else {
                Arrays.fill(ints, atomicInteger.get(), number, i);
            }
        }
        ArrayList<Integer> list = Lists.newArrayList(ints);
        Collections.shuffle(list);
        return list;
    }

    private static void method() {
        /**
         * 第一种实现：算出每级个数，添加进数组，随机下标
         */
        double first = 0.4;
        double second = 0.4;
        double three = 0.2;

        int a = 1;
        int b = 2;
        int c = 3;

        int sum = 10;

        int first_person = (int) (sum * first);
        int second_person = (int) (sum * second);
        int first_second_sum_person = first_person + second_person;
        int three_person = sum - first_second_sum_person;

        Integer[] ints = new Integer[sum];

        for (int i = 0; i < ints.length; i++) {
            if (i < first_person) {
                ints[i] = a;
            } else if (i < first_second_sum_person) {
                ints[i] = b;
            } else {
                ints[i] = c;
            }
        }

        System.out.println(Arrays.toString(ints));

        List<Integer> list = Arrays.asList(ints);
        Collections.shuffle(list);

        int A = 0;
        int B = 0;
        int C = 0;
        int v;
        int m;
        ArrayList<Integer> integers = new ArrayList<>();
        for (int J = 0; J < 100; J++) {
            v = (int) (Math.random() * (sum));
            m = list.get(v);
            integers.add(m);
            if (m == 1) {
                A += 1;
            } else if (m == 2) {
                B += 1;
            } else {
                C += 1;
            }
        }

        System.out.println(integers);
        System.out.println("A: " + A + "   B: " + B + "   C: " + C);
    }

    /**
     * 第二种方式：等差随机,金字塔
     */
    // 获取等差金字塔集合
    //  1. 获取一个数组
    //  2. 按索引位置向数组中填充等级
    //  3. 打乱顺序返回
    private static ArrayList<Integer> getPyramidList(int minLevel, int MaxLevel, int number) {

        if (minLevel < 1) {
            minLevel = 1;
        }
        Integer[] ints = new Integer[number];
        // 等差和
        int lobbySum = (minLevel + MaxLevel) * (MaxLevel - minLevel + 1) / 2;

        // 获取数量小于等差和时返回随机数组
        /*if (lobbySum > number) {
            for (int i = 0; i < ints.length; i++) {
                ints[i] = (int) (Math.random() * (MaxLevel - minLevel + 1) + minLevel);
            }
            return Lists.newArrayList(ints);
        }*/
        // 自增
        AtomicInteger atomicInteger = new AtomicInteger();
        int k;
        int i;
        for (i = MaxLevel, k = minLevel; i > (minLevel - 1); i--, k++) {
            if (i == minLevel) {
                Arrays.fill(ints, atomicInteger.get(), number, i);
            }
            Arrays.fill(ints, atomicInteger.getAndAdd((int) ((double) k * number / (double) lobbySum )), atomicInteger.get(), i);

        }
        ArrayList<Integer> list = Lists.newArrayList(ints);
//        Collections.shuffle(list);
        return list;
    }

}
