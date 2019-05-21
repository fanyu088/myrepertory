package com.example.demo14Sign;

import com.example.RO.AgentRO;
import com.example.RO.UserRO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class List_test {
    public static void main(String[] args) {


         Gson gson = new GsonBuilder().create();
        UserRO aa = new UserRO("a", "南京", 23);
        UserRO bb = new UserRO("b", "天津", 55);
        UserRO cc = new UserRO("马二", "无锡", 18);

        UserRO[] arrays = {aa,bb};
        ArrayList<UserRO> list = (ArrayList<UserRO>) Arrays.asList(arrays);


        list.add(cc);

        System.out.println(list);


    }

    // 获取代理线，此方法必须有序
    // 下级必须晚于上级进入list
    private static void method2() {
        ArrayList<AgentRO> agentROS = new ArrayList<>();
        LinkedList<Integer> agentROS1 = new LinkedList<>();
        ArrayList<AgentRO> agentROSAll = new ArrayList<>();
        AgentRO cc = new AgentRO("c", "上海", 17);
        AgentRO dd = new AgentRO("d", "无锡", 18);
        AgentRO ee = new AgentRO("e", "无锡", 19);
        AgentRO aa = new AgentRO("a", "南京", 23);
        AgentRO aa1 = new AgentRO("a1", "南京", 89);
        AgentRO bb = new AgentRO("b", "天津", 55);
        bb.setAgentId(23);
        cc.setAgentId(23);
        dd.setAgentId(55);
        ee.setAgentId(18);

        agentROSAll.add(aa);
        agentROSAll.add(cc);
        agentROSAll.add(dd);
        agentROSAll.add(ee);
        agentROSAll.add(aa1);
        agentROSAll.add(bb);


        agentROS1.add(aa.getId());

        for (AgentRO agentRO : agentROSAll) {

            if (agentROS1.contains(agentRO.getAgentId())){
                agentROS1.add(agentRO.getId());
                agentROS.add(agentRO);

            }
            if (agentRO.getId()==aa.getId()){
                agentROS.add(agentRO);
            }

        }

        System.out.println(agentROS);
    }

    // remove测试
    private static void method1() {
        UserRO aa = new UserRO("张三", "南京", 23);
        UserRO bb = new UserRO("李四", "天津", 55);
        UserRO cc = new UserRO("王五", "上海", 17);
        UserRO dd = new UserRO("马二", "无锡", 18);
        UserRO ee = new UserRO("赵一", "无锡", 18);

        ArrayList<UserRO> userROS = new ArrayList<>();
        ArrayList<UserRO> userROS1 = new ArrayList<>();

        userROS.add(aa);
        userROS.add(bb);
        userROS.add(cc);
        userROS.add(dd);
        userROS.add(ee);


        // remove一定要懂倒序，角标会变
        for (int i = userROS.size() - 1; i >= 0; i--) {
            userROS.remove(userROS.get(i));
        }
        userROS1.addAll(userROS);
        System.out.println(userROS1);
        System.out.println("111");
    }
}
