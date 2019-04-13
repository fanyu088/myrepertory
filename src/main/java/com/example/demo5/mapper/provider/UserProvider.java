package com.example.demo5.mapper.provider;

import org.apache.ibatis.jdbc.SQL;

public class UserProvider {

    public String methodFirst(int sum, int count) {

        SQL sql = new SQL();

        sql.SELECT("id,name,age")
                .FROM("user");

        if (sum > 0 && sum < 10) {
            sql.WHERE("age = 0.3%");
        }
        if (sum >= 10 && sum < 20) {
            sql.WHERE("age = 0.5%");
        } else if (sum >= 20) {
            sql.WHERE("age = 0.8%");
        }

        return sql.toString();


    }

}
