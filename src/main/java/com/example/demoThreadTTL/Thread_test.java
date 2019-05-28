package com.example.demoThreadTTL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Thread_test {

    public static void main(String[] args) throws InterruptedException {

        CacheThreadPoolUtil threadPoolUtil = CacheThreadPoolUtil.threadPoolUtil;
        ExecutorService executor = threadPoolUtil.executor;

        ArrayList<Callable<Map>> list = new ArrayList<>();


        HashMap<Integer, String> objectObjectHashMap = new HashMap<>();
        int sum = 100;


        for (int i = 0; i < 20; i++) {
            list.add(new Callable<Map>() {
                @Override
                public Map call() throws Exception {
                    objectObjectHashMap.put(sum, sum + "12");
                    return objectObjectHashMap;
                }
            });

        }
        List<Future<Map>> futures = executor.invokeAll(list);

        System.out.println(list);
    }
}
