package com.example.demo10;

public class SubString_Str {

    public static void main(String[] args) {

        String str = "kjlsdjfols;djlsd;djksf;";

        int index = str.indexOf(";");

        for (int i = 0; i < 100; i++) {

            long l = System.nanoTime();
            String s = String.valueOf(l);
            String substring1 = s.substring(3);

            System.out.println(l);
            long l1 = Long.parseLong(substring1);


            System.out.println(substring1);
        }


        String substring = str.substring(2);

        System.out.println(index);

        System.out.println(substring);

        long l = System.nanoTime();
        System.out.println(l);
        System.out.println(String.valueOf(l).length());







    }
}
