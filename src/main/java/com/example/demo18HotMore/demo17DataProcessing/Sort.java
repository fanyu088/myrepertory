package com.example.demo18HotMore.demo17DataProcessing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @auther FanYu
 * @date 2019/8/15 21:37
 */
public class Sort {

    public static void main(String[] args) {

        List list = new ArrayList<>(Arrays.asList(1,2,5,4,9,6,3,25,8,72,6,5));
        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);




    }
}
