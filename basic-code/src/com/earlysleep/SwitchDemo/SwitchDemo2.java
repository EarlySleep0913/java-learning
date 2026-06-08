package com.earlysleep.SwitchDemo;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //**switch的扩展知识：**
        //箭头标签
        //不加break也不会进行case穿透
        int number = 3;
        switch (number){
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            default -> System.out.println("输入的数字有误");
        }
        System.out.println("____________");

        //case后可加多个标签
        int a = 3;
        switch (a){
            case 1,2 -> System.out.println("星期一");
            case 3,4 -> System.out.println("星期二");
            case 5,6 -> System.out.println("星期三");
            default -> System.out.println("输入的数字有误");
        }
        System.out.println("____________");

        //switch可以有运行结果
        //yield关键字
        //模拟计算器

        int a1 = 10;
        int b1 = 20;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入运算符：");
        char op = sc.next().charAt(0);

        int result = switch (op){
            case '+' -> a1 +  b1;
            case '-' -> a1 -  b1;
            case '*' -> a1 *  b1;
            case '/' -> a1 /  b1;
            default -> {
                System.out.println("输入的运算符有误");
                yield 0;
            }

        };

        System.out.println( result);



    }
}
