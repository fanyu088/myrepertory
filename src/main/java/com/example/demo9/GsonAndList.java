package com.example.demo9;

import com.example.RO.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GsonAndList {

    public static void main(String[] args) {
        Gson gson = new Gson();
        System.out.println("2Collection集合的转换**************************");
        System.out.println("将一个Bean的List集合转换成为json字符串->");
        Collection<User> userList1 = new ArrayList<User>();
        for(int i=0;i<3;i++){
            User user = new User("如花",10+i,new StringBuffer("男"),false);
            userList1.add(user);
        }
        String json = gson.toJson(userList1);
        System.out.println("User的List集合对象转换成为Json字符串，json==="+json);

        System.out.println("***************************");
        System.out.println("将一个json字符串转换成为Bean的List集合->");

        String json1 = "[{\"age\":10,\"isChild\":false},{\"age\":11,\"isChild\":false},{\"age\":12,\"isChild\":false}]";
        Collection<User> userList2 =
                gson.fromJson(json1,
                        new TypeToken<Collection<User>>(){}.getType());

        Object o = gson.fromJson(json1, new TypeToken<User[]>() {
        }.getType());

        Object o1 = gson.fromJson(json1, new TypeToken<List<User>>() {
        }.getType());

        System.out.println("转换成为的User的List集合，userList2="+userList2);
        System.out.println();
        System.out.println(o);
        System.out.println(o1);
    }
}
