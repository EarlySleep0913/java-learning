package com.earlysleep.controllerloop;

public class BreakDemo1 {
    public static void main(String[] args) {

        /*
        break:
        不能单独存在的。
        可以用在switch和循环中，
        表示结束，跳出的意思。

        循环的快速生成方式： 次数.fori 回车
         */

        for (int i = 0; i < 100; i++) {
            if(i == 54){
                break;
            }
            System.out.println(i);
         //i==54时，跳出循环
        }


    }
}
