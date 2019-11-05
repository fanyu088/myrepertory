package com.example.demo18HotMore.demo17DataProcessing;

import com.example.RO.UserListRO;
import com.example.RO.UserRO;
import com.mysql.jdbc.log.LogUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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

        List list_db = new ArrayList<>(Arrays.asList(0.45,0.2,0.56,0.46,1.24,0.54,1.12,1.1,0.05,0.52,1.38,0.83,1.42,0.17,0.55,1.44,0.13,1.09,0.37,0.71,1.23,1.38,0.52,0.13,1.26,1.06,0.49,0.88,0.81,0.23,1.2,0.29,1,0.54));
        List list_sj = new ArrayList<>(Arrays.asList(0.46,0.45,0.56,0.2,1.24,0.54,1.1,1.12,0.05,0.83,1.38,1.42,0.52,1.09,0.17,0.55,1.44,0.13,0.37,0.13,0.52,1.38,1.23,0.71,0.88,1.26,0.81,1.06,0.23,1.2,0.29,1,0.54,0.09));

        ArrayList<Object> list_temp1 = new ArrayList<>();
        ArrayList<Object> list_temp2 = new ArrayList<>();
        for (Object o : list_db) {
            if (!list_sj.contains(Double.valueOf(o.toString()))){
                list_temp1.add(Double.valueOf(o.toString()));
            }
        }
        for (Object o : list_sj) {
            if (!list_db.contains(Double.valueOf(o.toString()))){
                list_temp2.add(Double.valueOf(o.toString()));
            }
        }
        System.out.println(list_temp1);
        System.out.println("==============");
        System.out.println(list_temp2);
    }

    private static void method2() {
        Logger logger = LoggerFactory.getLogger(Sort.class);

        UserRO userRO = new UserRO("name_", "adress_", 23);
        UserRO userRO1 = new UserRO("name_", "adress_", 54);
        ArrayList<UserRO> userROS = new ArrayList<>();
        userROS.add(userRO);
        userROS.add(userRO1);
        logger.info("--" + userROS);
        logger.info("--" + userROS.toString());
        System.out.println(userROS);
    }


    private static void method1() {
        List list = new ArrayList<>(Arrays.asList(1,2,5,4,9,6,3,25,8,72,6,5));
        Collections.sort(list);
        Collections.reverse(list);

        System.out.println(list);

        String s = "fg_slot";
        System.out.println(s.substring(0,s.indexOf("_")));
        System.out.println(s.substring(s.indexOf("_")+1));
        String test = String.format("CHAT_ROOM_STOP_%s","08bd1006-9c77-448a-a709-0108979999c");
        System.out.println(test);
    }
}
