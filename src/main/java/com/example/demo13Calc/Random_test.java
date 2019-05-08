package com.example.demo13Calc;

public class Random_test {
    public static void main(String[] args) {

        int i = 2;
        int max = 0;
        int min = 0;
        int v;          // 0为盈利1为亏损

        int init = 2;   // 第一次投注
        int num = 4;    // 最大投注次数
        int ratio = 3;  // 增长倍率

        int win = 0;    // 盈利
        int lose = 0;   // 亏损

        for (int j = 0; j < 10; j++) {

            for (int k = 1; k <= num; k++) {

                v = (int) (Math.random() * i);
                if (v == 0) {
                    win += init * k * ratio ;
                    min++;
                }
                if (v == 1) {
                    lose += init * k * ratio ;
                    max++;
                }

            }


        }

        System.out.println("win:" + win + " , lose:" +lose);
        System.out.println("max:" + max + " , min:" + min);


    }
}
