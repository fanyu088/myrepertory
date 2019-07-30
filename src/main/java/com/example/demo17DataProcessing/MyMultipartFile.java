package com.example.demo17DataProcessing;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.util.Assert;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Properties;

/**
 * @auther FanYu
 * @date 2019/7/26 16:21
 */
public class MyMultipartFile {

    public static void main(String[] args) throws IOException {


        String string/* = "d"*/ = " ";
        try {
            method(string);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        File file1 = new File("E:\\私人\\hello.txt");
        FileInputStream fileInputStream = new FileInputStream(file1);

        Properties properties = new Properties();
        properties.load(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));

        System.out.println(properties);

        MultipartFile s = new MockMultipartFile("s", fileInputStream);
        System.out.println(Arrays.toString(s.getBytes()));
        System.out.println(s.getName());



    }
    private static void method(String string){
        System.out.println("111111");
        Assert.hasLength(string,"this string no is null"); //为空或为空字符串会抛IllegalArgumentException
        System.out.println("2222222");
    }



}
