package com.example.demo2;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetName {

    public static void main(String[] args) throws Exception {
        method();


    }


    public static void method() throws IOException {


        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //代理对象
//        HttpHost proxy = new HttpHost("127.0.0.1", 8888, "http");
        //配置对象
//        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();

        List list = new ArrayList();
        Set set = new HashSet();


        for (int i = 1; i < 940; i++) {

            //创建请求方法的实例， 并指定请求url
            HttpGet httpget = new HttpGet("https://book.qidian.com/ajax/comment/info?_csrfToken=PB0yagvmzuLX2ey7tmQyPY4n6XKoFZTBSMxUuoJR&pageIndex="+i+"&pageSize=15&orderBy=2&bookId=1209977");
            //使用配置
//        httpget.setConfig(config);
            CloseableHttpResponse response = httpClient.execute(httpget);
            HttpEntity entity = response.getEntity();
            String content = EntityUtils.toString(entity, "utf-8");

            JSONObject jsonObject = JSONObject.parseObject(content);
            // 获取到key为shoppingCartItemList的值
            String r = jsonObject.getString("data");
            JSONObject objects = JSONObject.parseObject(r);
            String c = objects.getString("commentInfo");
            JSONArray objects1 = JSON.parseArray(c);


            for (int j = 0; j < objects1.size(); j++) {

                Object nickName = JSONObject.parseObject(objects1.get(j).toString()).get("nickName");

                String nick = (String) nickName;

                if (!nick.contains("书友")) {

                    set.add("\"" + nick + "\"");
                }

            }


        }


        System.out.println(set);
        System.out.println(set.size());


        httpClient.close();
    }

    private static void methodFirst() throws IOException {
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //代理对象
        HttpHost proxy = new HttpHost("127.0.0.1", 8888, "http");
        //配置对象
        RequestConfig config = RequestConfig.custom().setProxy(proxy).build();
        //创建请求方法的实例， 并指定请求url
        HttpGet httpget = new HttpGet("https://book.qidian.com/ajax/comment/info?_csrfToken=PB0yagvmzuLX2ey7tmQyPY4n6XKoFZTBSMxUuoJR&pageIndex=2&pageSize=15&orderBy=2&bookId=1010868264");

        //使用配置
//        httpget.setConfig(config);

        //设置头部信息进行模拟登录（添加登录后的Cookie）
        httpget.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        httpget.setHeader("Accept-Encoding", "gzip, deflate, br");
        httpget.setHeader("Accept-Language", "zh-CN,zh;q=0.9");
        httpget.setHeader("Connection", "keep-alive");
        httpget.setHeader("Cookie", "_csrfToken=PB0yagvmzuLX2ey7tmQyPY4n6XKoFZTBSMxUuoJR; newstatisticUUID=1553835542_2044733363; e1=%7B%22pid%22%3A%22qd_P_all%22%2C%22eid%22%3A%22qd_B58%22%2C%22l1%22%3A5%7D; e2=%7B%22pid%22%3A%22qd_p_qidian%22%2C%22eid%22%3A%22qd_A15%22%2C%22l1%22%3A3%7D");
        httpget.setHeader("Host", "book.qidian.com");
        httpget.setHeader("Referer", "https://book.qidian.com/info/1010868264");
        httpget.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.86 Safari/537.36");
        httpget.setHeader("X-Requested-With", "XMLHttpRequest");

        //3.执行get请求并返回结果


        CloseableHttpResponse response = httpClient.execute(httpget);
        try {
            //4.处理结果
            String s = response.toString();
            System.out.println(s);


        } finally {
            response.close();
        }
    }

    public static void methodSecond() throws InterruptedException, IOException, URISyntaxException {


        String url = "https://book.qidian.com/ajax/comment/info?_csrfToken=PB0yagvmzuLX2ey7tmQyPY4n6XKoFZTBSMxUuoJR&pageIndex=2&pageSize=15&orderBy=2&bookId=1010868264";
        Desktop desktop = Desktop.getDesktop();
        if (desktop.isDesktopSupported() && desktop.isSupported(Desktop.Action.BROWSE)) {
            URI uri = new URI(url);

            desktop.browse(uri); //使用系统默认的浏览器执行这个url
            Thread.sleep(2000);
            //Runtime.getRuntime().exec("taskkill /F /IM Iexplore.exe");
//            Runtime.getRuntime().exec("taskkill  /IM firefox.exe"); //因为我系统默认的是火狐,然后关闭火狐浏览器
        }
    }


}
