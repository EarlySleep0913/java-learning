package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo3 {
    public static void main(String[] args) {
      //判断哪家外卖平台优惠力度大
      //scanner输入消费金额
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入消费金额：");
      double money = sc.nextDouble();
      //饱了么App：全场9折优惠,美单App：满30减10
      //定义两个变量，分别代表apps的优惠价格
      double app1 = money * 0.9;

      if (money >= 30){
          double app2 = money - 10;
          System.out.println("apps2优惠价格："+app2);
      }
      
      double app2 = money >= 30 ? money - 10 : money;
      if(app1 < app2){
          System.out.println("apps1比apps2优惠");
      }
      else{
          System.out.println("apps2比apps1优惠");
      }
    }
}
