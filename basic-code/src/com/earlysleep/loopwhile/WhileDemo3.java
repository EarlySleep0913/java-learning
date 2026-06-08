package com.earlysleep.loopwhile;

import java.util.Scanner;

public class WhileDemo3 {
    public static void main(String[] args) {
    //给定一个整数 n，请计算其所有数位之和。若 n 为负数，请先取其绝对值

        //键盘输入n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();

        //判断n是否为负数
        if (n < 0) {
            n = -n;
        }

        //求和
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("和为：" + sum);

    }
}
