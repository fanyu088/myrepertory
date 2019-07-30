package com.example.demo18HotMore.demo17DataProcessing;

import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;

/**
 * @auther FanYu
 * @date 2019/7/27 22:48
 */
public class HotMore {

    public static void main(String[] args) throws Exception {

        String name = "E:\\私人\\";
        String parmName = "book.txt";

        FileInputStream fileInputStream = new FileInputStream("E:\\私人\\hello.txt");

//        new Properties().load(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));

        MultipartFile file = new MockMultipartFile(parmName, fileInputStream);

        File file_In = new File(name + parmName);

        file.transferTo(file_In);

        System.out.println(name + parmName);




    }


}


