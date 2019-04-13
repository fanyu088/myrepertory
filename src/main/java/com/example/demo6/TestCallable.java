package com.example.demo6;

import java.util.Calendar;
import java.util.concurrent.*;

public class TestCallable {

    private static ExecutorService executor= Executors.newCachedThreadPool(new ThreadFactory() {
        int ncount=0;
        @Override
        public Thread newThread(Runnable r) {
            ncount++;
            Thread invokeThread=new Thread(r);
            invokeThread.setName("Invoker-thread-"+ncount);
            invokeThread.setDaemon(true);
            return invokeThread;
        }
    });

    public static void callSth(Runnable task, TimeUnit unit, long timeout)throws Exception{
        Future<?> futureResult=executor.submit(task);
        futureResult.get(timeout, unit);
    }

    public static void main(String[] args) {

        System.out.println(1<<2);

        Runnable rb=new Runnable() {
            @Override
            public void run() {
                TestCallable tc=new TestCallable();
                tc.dosth();//模拟调用外部接口
            }
        };
        //5秒超时
        try {
            long s= Calendar.getInstance().getTimeInMillis();
            callSth(rb,TimeUnit.MILLISECONDS,5000);
            System.out.println("运行时间:"+(Calendar.getInstance().getTimeInMillis()-s));
        } catch (Exception e) {//抓这两个异常更准确，纯粹模拟为省事就抓老大了。InterruptedException, TimeoutException
            System.err.println("调用外部接口超时了!");
        }
        //模拟2秒超时
        try {
            callSth(rb,TimeUnit.MILLISECONDS,2000);
        } catch (Exception e) {//抓这两个异常更准确，纯粹模拟为省事就抓老大了。InterruptedException, TimeoutException
            System.err.println("调用外部接口超时了!");
        }
    }

    public void dosth(){//模拟外部接口
        try {
            System.out.println("开始睡觉");
            Thread.sleep(2500);
            System.out.println("睡醒了");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
