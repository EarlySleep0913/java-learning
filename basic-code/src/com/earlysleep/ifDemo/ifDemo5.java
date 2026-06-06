package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo5 {
     public static void main(String[] args) {
      /* 键盘录入任意三个大于0的小数，判断这三个数值构成什么类型的三角形？

    需要判断的类型如下：

    等边、等腰、直角、普通、无效

    三角形的构成条件：任意两边之和大于第三边

    a \+ b \> c \&\& a \+ c \> b \&\& b \+ c \> a*/

         //键盘录入边长
         Scanner sc = new Scanner(System.in);
         System.out.println("请输入a边长：");
         double a = sc.nextDouble();
         System.out.println("请输入b边长：");
         double b = sc.nextDouble();
         System.out.println("请输入c边长：");
         double c = sc.nextDouble();

         //判断三角形是否存在
         if(a + b > c && a + c > b && b + c > a){
             //判断三角形类型
             if(a == b && b == c){
                 System.out.println("等边三角形");
             }
             else if(a == b || a == c || b == c){
                 System.out.println("等腰三角形");
             }
             else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a){
                 System.out.println("直角三角形");
             }
             else{
                 System.out.println("普通三角形");
             }
         }
         else{
             System.out.println("无效三角形");
         }

     }

}
