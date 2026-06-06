package com.earlysleep.variable;

public class VariableDemo1 {
    public static void main(String[] args) {
        /*微信余额:0元
        支付宝余额:10元
        银行卡余额:20元
        问题一:请问现在一共有多少钱?
        问题二:微信收了10元红包，又发了2元红包，余额多少?*/

        //定义变量记录微信余额
        double weixinMoney = 0;

        //定义变量记录支付宝余额
        double zhifubaoMoney = 10;

        //定义变量记录银行卡余额
        double bankMoney = 20;

        //问题一
        System.out.println("现在一共有" + (weixinMoney + zhifubaoMoney + bankMoney) + "元");

        //问题二
        //定义发红包和收红包的变量
        double sendMoney = 2;
        double receiveMoney = 10;
        weixinMoney = weixinMoney + receiveMoney - sendMoney;
        System.out.println("微信余额" + weixinMoney);
    }
}
