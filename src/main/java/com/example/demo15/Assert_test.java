package com.example.demo15;

import com.example.RO.UserRO;

public class Assert_test {


    static UserRO method(UserRO string) {

        assert string != null;
        String[] split = string.getAdress().split(",");
        String a = split[0];
        System.out.println(split.length);
        UserRO userRO = new UserRO();
        if (split.length>1){
            userRO.setFlag(Boolean.valueOf(split[1]));
        }
        userRO.setName(a);
        return userRO;

    }
}
