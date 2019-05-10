package com.example.demo14Sign;



import com.alibaba.ttl.threadpool.TtlExecutors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * CachedThreadPool 单例工具类
 */
public class CacheThreadPoolUtil {
    public ExecutorService executor;

    private CacheThreadPoolUtil(){
        /** 此处使用阿里TTL解决线程池ThreadLocal值传递问题 */
        /**
         * 线程池限制16-32个线程，千万不能去掉限制！
         */
        executor = TtlExecutors.getTtlExecutorService(Executors.newFixedThreadPool(16));
    }

    public static CacheThreadPoolUtil threadPoolUtil = new CacheThreadPoolUtil();

    public static void main(String[] args) throws Exception {
        CacheThreadPoolUtil threadPoolUtil = CacheThreadPoolUtil.threadPoolUtil;
        ArrayList<Callable<Object>> list=new ArrayList<Callable<Object>>();
        Map map = new HashMap();
        for (int i = 0; i < 1000; i++) {
            list.add(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    map.put(Thread.currentThread(),"thread"+Thread.currentThread().getName());
                    System.out.println(Thread.currentThread().getName());
                    return null;
                }
            });
        }
        threadPoolUtil.executor.invokeAll(list);
        System.out.println("可以汇总计算了！");
        System.out.println(map.size());
       // threadPoolUtil.executor.shutdown();
    }

    /**
     * 查看活跃线程数量
     * @return
     */
    public int getRunningThreadCount(){
        ExecutorService executorService = TtlExecutors.unwrap(executor);
        return ((ThreadPoolExecutor)executorService).getActiveCount();
    }
}
