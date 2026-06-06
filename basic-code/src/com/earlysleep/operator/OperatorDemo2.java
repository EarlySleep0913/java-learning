package com.earlysleep.operator;

import java.util.Scanner;

public class OperatorDemo2 {
    public static void main(String[] args) {
    //给定秒数seconds，计算出时、分、秒，总时间不变，但是分钟和秒数都不超过59
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int seconds = sc.nextInt();
        int hour = seconds / 3600;
        int minute = seconds / 60 % 60;
        int second = seconds % 60;


        System.out.println(hour + ":" + minute + ":" + second);

    }

}
