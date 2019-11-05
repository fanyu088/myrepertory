package com.example.demo11;

import com.google.common.collect.Lists;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class getIssue_sub {
    public static void main(String[] args) {

        List<String> txNextFewIssue = getNextFewIssueTest("20191019002", 3, true,7);
        System.out.println(txNextFewIssue);

    }
    public  static  List<String> getNextFewIssueTest(String currentIssue, int maxIssue, boolean placeholder, int count) {
        int intIssue = Integer.parseInt(currentIssue.substring(8));
        String date = currentIssue.substring(0, 8);
        List<String> issues = Lists.newArrayList();
        //当前期数加上所追期数大于今天最大期数
        if (intIssue + count > maxIssue) {
            getIssueList(maxIssue, placeholder, count, intIssue, date, issues);
        } else {
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i < intCurrentIssue + count; i++) {
                issues.add(String.valueOf(i));
            }
        }
        return issues;
    }

    private static void getIssueList(int maxIssue, boolean placeholder, int count, int intIssue, String date, List<String> issues) {

        //是否需要占位符
        if (placeholder) {
            date += "0";
        }
        // 今天的期数
        for (int i = intIssue; i <= maxIssue; i++) {
            addIssue(date, issues, i,placeholder);
        }
        //超出今天的期数
        int beyondValue = intIssue + count - maxIssue;
        if (beyondValue > 0){
            String secondDate = date;
            if (placeholder){
                // 去掉占位符
                secondDate = date.substring(0,date.length()-1);
            }
            // 加一天
            secondDate = formatDateByFormat(getNextDay(parseDate(secondDate, "yyyyMMdd"), 1),"yyyyMMdd");
            intIssue = 1; // 第二天第一期
            getIssueList(maxIssue,placeholder,beyondValue,intIssue,secondDate, issues);
        }
    }
    /**
     * 日期转换为字符串
     *
     * @param date   日期
     * @param format 日期格式
     * @return 指定格式的日期字符串
     */
    public static String formatDateByFormat(Date date, String format) {
        String result = "";
        if (date != null) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(format);
                result = sdf.format(date);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return result;
    }
    /**
     * 日期格式字符串转换为日期对象
     *
     * @param strDate 日期格式字符串
     * @param pattern 日期对象
     * @return
     */
    public static Date parseDate(String strDate, String pattern) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(pattern);
            return format.parse(strDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    /**
     * 获取当前时间前一天（-1）、当前时间（0），后一天（1）
     * @param date
     * @return
     */
    public static Date getNextDay(Date date, Integer plus) {
        if(date==null||plus==null){
            return date;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, plus);
        date = calendar.getTime();
        return date;
    }

    private  void addIssueTest(String date, List<String> issues, int i,boolean placeholder) {
        if (i < 10) {
            issues.add(date + "0" + String.valueOf(i));
        }
        //超过100则占位符无用，适用于每天期数超过100期
        else if(i>=100 && placeholder){
            issues.add(date.substring(0,date.length()-1)+String.valueOf(i));
        }else {
            issues.add(date + String.valueOf(i));
        }
    }

    private  void getIssue(String date, List<String> issues, int i,boolean placeholder) {
        if (i < 10) {
            issues.add(date + "0" + String.valueOf(i));
        }
        //超过100则占位符无用，适用于每天期数超过100期
        else if(i>=100 && placeholder){
            issues.add(date.substring(0,date.length()-1)+String.valueOf(i));
        }else {
            issues.add(date + String.valueOf(i));
        }
    }







    public static List<String> getTXNextFewIssue(String currentIssue, int maxIssue, int count) {

        int intIssue = Integer.parseInt(currentIssue.substring(8));
        List<String> issues = new ArrayList<>();

        if (intIssue + count > maxIssue) {
            int beyondValue = intIssue + count - maxIssue;
            // 超出的期数不能大于第二最大期数
            if (beyondValue > maxIssue) {
                beyondValue = maxIssue;
            }
            // 未超出的部分
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i <= (intCurrentIssue + count - beyondValue); i++) {
                issues.add(String.valueOf(i));
            }
            // 超出的部分
            String date = "20190415";
            for (int i = 1; i < beyondValue; i++) {
                addTXIssue(date, issues, i);
            }
        } else {
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i < intCurrentIssue + count; i++) {
                issues.add(String.valueOf(i));
            }
        }
        return issues;
    }

    private static void addTXIssue(String date, List<String> issues, int i) {

        if (i < 10) {
            issues.add(date + "000" + String.valueOf(i));
        } else if (i < 100) {
            issues.add(date + "00" + String.valueOf(i));
        } else if (i < 1000) {
            issues.add(date + "0" + String.valueOf(i));
        } else {
            issues.add(date + String.valueOf(i));
        }

    }


    public static List<String> getTXNextFewIssue1(String currentIssue, int maxIssue, int count) {

        int intIssue = Integer.parseInt(currentIssue.substring(8));
        String date = currentIssue.substring(0, 8);
        List<String> issues = new ArrayList<>();

        if (intIssue + count > maxIssue) {
            int beyondValue = intIssue + count - maxIssue;
            // 超出的期数不能大于第二最大期数
            if (beyondValue > maxIssue) {
                beyondValue = maxIssue;
            }
            // 未超出的部分
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i <= Long.parseLong(date + maxIssue); i++) {
                issues.add(String.valueOf(i));
            }
            // 超出的部分
            date = "20190415";
            for (int i = 1; i < beyondValue; i++) {
                addTXIssue1(date, issues, i, maxIssue);
            }

        } else {
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i < intCurrentIssue + count; i++) {
                issues.add(String.valueOf(i));
            }
        }
        return issues;
    }

    private static void addTXIssue1(String date, List<String> issues, int i, int maxIssue) {

        if (maxIssue > 1000) {
            date += "0";
        }
        if (i < 10) {
            issues.add(date + "00" + String.valueOf(i));
        } else if (i < 100) {
            issues.add(date + "0" + String.valueOf(i));
        } else if (i < 1000) {
            issues.add(date + String.valueOf(i));
        } else {
            issues.add(date.substring(0, date.length() - 1) + String.valueOf(i));
        }

    }

    public static List<String> getNextFewIssue(String currentIssue, int maxIssue, boolean placeholder, int count) {
        int intIssue = Integer.parseInt(currentIssue.substring(8));
        String date = currentIssue.substring(0, 8);
        List<String> issues = new ArrayList<>();
        //当前期数加上所追期数大于今天最大期数
        if (intIssue + count > maxIssue) {
            //超出今天的期数
            int beyondValue = intIssue + count - maxIssue;
            //是否需要占位符
            if (placeholder) {
                date += "0";
            }
            for (int i = intIssue; i <= maxIssue; i++) {
                addIssue(date, issues, i, placeholder);
            }
            date = "20150415";
            if (placeholder) {
                date += "0";
            }
            for (int i = 1; i < beyondValue; i++) {
                addIssue(date, issues, i, placeholder);
            }
        } else {
            long intCurrentIssue = Long.parseLong(currentIssue);
            for (long i = intCurrentIssue; i < intCurrentIssue + count; i++) {
                issues.add(String.valueOf(i));
            }
        }
        return issues;
    }

    private static void addIssue(String date, List<String> issues, int i, boolean placeholder) {
        if (i < 10) {
            issues.add(date + "0" + String.valueOf(i));
        }
        //超过100则占位符无用，适用于每天期数超过100期
        else if (i >= 100 && placeholder) {
            issues.add(date.substring(0, date.length() - 1) + String.valueOf(i));
        } else {
            issues.add(date + String.valueOf(i));
        }
    }
}
