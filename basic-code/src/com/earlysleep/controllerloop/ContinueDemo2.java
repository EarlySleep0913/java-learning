package com.earlysleep.controllerloop;

import java.util.Scanner;

public class ContinueDemo2 {

    public static <scanner> void main(String[] args) {

        //键盘录入正整数，满足1≦n≦10的5次方
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入正整数：");
        int n = sc.nextInt();

       /* for(int i = 1; i <= n; i++){
            int a = i;

            if(a % 4 == 0){
                continue;
            }
            else {
                while (a > 0){
                    if (a % 10 == 4) {
                        continue;
                    } else {
                        a = a / 10;
                    }
                }
            }
            System.out.println(i);
        }*/

        for(int i = 1; i <= n; i++){
            int a = 0;
            if(i % 4 != 0){
                int c = i;
                while(c > 0){
                    if(c % 10 == 4){
                        a = 1;
                        break;
                    }
                    c = c / 10;
                }
                if(a == 0){
                    System.out.println(i);
                }
            }
        }
    }
}
