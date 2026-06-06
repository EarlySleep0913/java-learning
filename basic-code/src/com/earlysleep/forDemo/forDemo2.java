package com.earlysleep.forDemo;

public class forDemo2 {
    public static void main(String[] args) {
    //求1-5之间的数据和，并把求和结果在控制台输出
        int sum = 0;
        for (int i = 1; i <= 5;i ++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
