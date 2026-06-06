package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo4 {
    public static void main(String[] args) {

        /*很多App都有不同的优惠券
        假设，现在有以下优惠券
        全场商品满10减8
        全场商品满50减30
        全场商品满100减50
        全场商品满200减90
        会员卡：全场8折
        请问：会员卡和优惠券不能同时使用，最优惠的价格是多少？
*/
        //消费金额
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double money = sc.nextDouble();

        //会员卡
        double memberCard = money * 0.8;

        //优惠券
        double coupon = money;
        if(money >= 200){
            coupon = money - 90;
        }
        else if(money >= 100){
            coupon = money - 50;
        }
        else if(money >= 50){
            coupon = money - 30;
        }
        else if(money >= 10){
            coupon = money - 8;
        }
        else{
            System.out.println("价格有误");
        }

        //最优惠价格
        if(memberCard < coupon){
            System.out.println("使用会员卡，价格最优惠：" + memberCard);
        }
        else{
            System.out.println("使用优惠券，价格最优惠：" + coupon);
        }

    }
}
