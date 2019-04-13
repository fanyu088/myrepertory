package com.example.demo11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LotteryUtill {
    public static void main(String[] args) throws ParseException {

        // 格式：DRAW_TIME.put(LocalTime.parse("09:05:00"), 1);
        //		 DRAW_TIME.put(LocalTime.parse("09:10:00"), 2);

        String startTime = "1970-01-01 00:02:00";
        String endTime = "1970-01-01 23:58:00";
        String intervalTime = "1970-01-01 00:02:00";

        // 1.转换为时间戳
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long start_T = simpleDateFormat.parse(startTime).getTime() + 28800000;
        long end_T = simpleDateFormat.parse(endTime).getTime() + 28800000;
        long interval_T = simpleDateFormat.parse(intervalTime).getTime() + 28800000;

        // 2.循环加差值
        for (int i = 1; end_T >= start_T; start_T += interval_T) {
            String format = simpleDateFormat.format(start_T - 28800000);

            String str = "\"" + format.substring(format.indexOf(" ") + 1) + "\"";
            System.out.println("DRAW_TIME.put(LocalTime.parse(" + str + "), " + (i++) + "); ");

        }

        String[] strings = {"180212",
                "qjg721219",
                "xzqadhw118",
                "xszq",
                "zxy10086",
                "zm1108",
                "titer",
                "wangjinquan",
                "wy47459603",
                "bbbnnn88",
                "zhang12332",
                "86921214",
                "caj406",
                "liangzicheng",
                "l153615",
                "liuyanan",
                "1380",
                "mmtamm1981","yy2010927","lovezxy","sfq760315","lm1208","yxl1472580369","aa15158278366",

                "ssa11414","a523321","19950621816","123456789wei","jjkkoo","13966590841","huya118","wc99238","4894120","yg1710","lxw520","phz888","zzf666666","caishen001",
                "a1666163047","yy123456","51688","1204244332","guoxiu","9988",

                "1830391885","xhz18313715418","tangguipeng","qu3998275","mc1901","lijuanxingfuyish","xiaogao8434","a880926","ywy123456","chenze","w526469273","a15347838259",
                "ly881015","clj1998","haowan123","1987117","gudi0924","kitty","abc12345","53753207","315142455","15858884459","h252","cizi1414","1360541629","hahaha521","li670866073",
                "aa970010","mx777520","zhi1986315","sg1987","zhouqing","gg98765","zhang8236","594263062","180280","888917","jk080",

                "qzx0817","aa251610958","10060489","pp1997112","babyte","yan1985417","yuan345","xiaozhu","13040887260","lsyj2009styz","w181031","a1234750",
                "55555","1019","917caipiao","3146068426","zhangtianxiang","12138","enhui117","zxc259","huangtianzhi520","l1272972082","wz1452",
                "hanhan","wangchen","lxscb","1375347518","xiaoxiao888","s0111","as0111","wtx0214","lizhao","ct5200909","ti0128","cc224520","jsnnxj"} ;

    }
}
