package com.earlysleep.forDemo;

import java.util.Scanner;

public class forDemo3 {

    public static void main(String[] args) {
    //键盘录入两个数字，表示一个范围
        //在范围内，统计所有能被3整除，又能被5整除的数字，有多少个
        
        //键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字一：");
        int a = sc.nextInt();
        System.out.println("请输入数字二：");
        int b = sc.nextInt();

        //判断两个数字的最大值和最小值
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        System.out.println("范围是："+ min + "~" + max);
        //统计
        int count = 0;
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("在"+min+"~"+max+"之间没有符合条件的数字");
        }else {
            System.out.println("在"+min+"~"+max+"之间有"+count+"个符合条件的数字");
        }
    }
}

