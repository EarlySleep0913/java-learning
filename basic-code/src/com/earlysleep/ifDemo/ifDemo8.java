package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo8 {
    //计算电费
    //0~100度 0.5元/度
    //100~200度 0.8元/度
    //超过200度 1.2元/度

    public static void main(String[] args) {
        //输入度数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入度数：");
        int degree = sc.nextInt();

        //定义变量，保存电费
        double money = 0;

        if(degree <= 100){
            money = degree * 0.5;
        }
        else if(degree <= 200){
            money = 50 + (degree - 100) * 0.8;
        }
        else{
            money = 130 + (degree - 200) * 1.2;
        }

        System.out.println("电费为："+money);
    }
}
