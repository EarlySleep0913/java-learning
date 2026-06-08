package com.earlysleep.loopwhile;

public class WhileDemo1 {

	public static void main(String[] args) {
		//假设你在银行投资了100000元，
        // 银行给出的复利是1.7%，问
        // 多少年后能实现本金翻倍？

        double money = 100000;
        int year = 0;
        while(money <= 200000){
            money = money * 1.017;
            year++;
		}
        System.out.println("第"+year+"年后，余额为："+money);
	}
}


