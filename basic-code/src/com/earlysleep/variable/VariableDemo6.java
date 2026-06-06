package com.earlysleep.variable;

import java.util.Scanner;

public class VariableDemo6 {

    static void main() {
        //找到Scanner
        Scanner sc = new Scanner(System.in);

        //接收键盘录入的整数
        int a = sc.nextInt();
        System.out.println(a);


        //接收键盘录入的小数
        double b = sc.nextDouble();
        System.out.println(b);

        //接收键盘录入的文本（字符串）
        String c = sc.next();
        System.out.println(c);

    }



}
