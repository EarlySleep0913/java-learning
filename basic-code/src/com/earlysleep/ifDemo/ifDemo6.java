package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo6 {
    public static void main(String[] args) {
    //充卡赠送
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        double money = sc.nextDouble();

        if(money < 1000){
            money = money;
        }
        else if(money < 2000){
            money = money + 200;
        }
        else if(money < 3000){
            money = money + 500;
        }
        else if(money < 5000){
            money = money + 700;
        }
        else if(money < 10000){
            money = money + 1300;
        }
        else if(money < 20000){
            money = money + 2500;
        }
        else if(money < 50000){
            money = money + 6000;
        }
        else if(money > 50000){
            money = money + 15000;
        }
        else{
            System.out.println("充值失败！");
        }


        System.out.println("充值成功！余额为："+money);
    }

}
