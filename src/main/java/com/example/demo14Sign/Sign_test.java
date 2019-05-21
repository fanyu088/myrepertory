package com.example.demo14Sign;

import org.apache.commons.codec.cli.Digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Sign_test {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        String name = "a";
        String scope = "c";
        String age = "b";
        String age1 = "b";

        method(name,scope,age);


    }

    private static void method(String... values) throws NoSuchAlgorithmException {

        Arrays.sort(values);

        String string = String.join("-" , values);
        System.out.println(string);
        // md5加密
        MessageDigest instance = MessageDigest.getInstance("MD5");
        System.out.println(Arrays.toString(string.getBytes()));
        byte[] digest = instance.digest(string.getBytes());
        System.out.println(Arrays.toString(digest));


        // 16进制
        StringBuilder stringBuilder = new StringBuilder();
        for (byte b : digest) {

            System.out.print(b & 0xff);
            byte b1 = (byte) (b & 0xff);
            System.out.print(" " + b1);
            String hv = Integer.toHexString(b & 0xff);
            System.out.println(" " + hv);
            if (hv.length() < 2){
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }

        String sign = stringBuilder.toString();

        System.out.println(sign);

    }
}
