package com.example.demo15;

/**
 * @auther HuanYu
 * @date 2019/6/3 10:54
 */
public class IndexOf_test {
    public static void main(String[] args) {

        String a = "2" ;
        String b = "22" ;
        String c = "222" ;
        String d = "2." ;
        String e = "2.00" ;
        String f = "2.000" ;

        method(a);
        method(b);
        method(c);
        method(d);
        method(e);
        method(f);


    }

    public static void method(String s){

        try {
            Double.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("错啦！！");
        }

        boolean contains = s.contains(".");
        if (contains){

            int length = s.substring(s.lastIndexOf(".") + 1 ).length();
            System.out.println(s + "--" +length);
        }



    }

}
