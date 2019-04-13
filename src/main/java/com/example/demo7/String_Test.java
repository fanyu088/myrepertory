package com.example.demo7;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;

public class String_Test {
    public static void main(String[] args) throws IOException {

        String s = "";
        String str = " ";
        String string = null;
        String S;

        System.out.println(s.length()==0);//true
        System.out.println(s==null);//false
        System.out.println("-----------------------");
        System.out.println(str.length()==0);//false
        System.out.println(str==null);//false
        System.out.println("-----------------------");
        System.out.println(string.length()==0);//抛出异常NullPointerException
        System.out.println(string==null);//true
        System.out.println("-----------------------");
//        System.out.print(S.length()==0);//直接编译报错
//        System.out.println(S==null);//直接编译报错
        System.out.println("-----------------------");

        File file = new File("kkdkdk");
        InputStream fileInputStream = new FileInputStream(file);
        MultipartFile mockMultipartFile = new MockMultipartFile("", fileInputStream);





    }
}
