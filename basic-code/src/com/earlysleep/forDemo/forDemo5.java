package com.earlysleep.forDemo;

import java.util.Scanner;

public class forDemo5 {
    public static void main(String[] args) {
        /*牛牛开始学习数列啦。现在他想计算以下数列前 n 项的和：

        S(n) = 1 − 2 + 3 − 4 + ⋯*/

        //键盘录入n
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int n = sc.nextInt();

        //求和
        int sum = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum -= i;//偶数
            }
            else{
                sum += i;//奇数
            }
        }
        System.out.println(sum);

    }
}
