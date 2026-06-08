package com.earlysleep.loopwhile;

public class WhileDemo2 {
    public static void main(String[] args) {
//        世界最高山峰珠穆朗玛峰高度是：8848.86米=8848860毫米，
//        假如我有一张足够大的纸，它的厚度是0.1毫米。
//        请问：该纸张折叠多少次，可以折成珠穆朗玛峰的高度？

        double height = 8848860;
        double thickness = 0.1;
        int count = 0;
        while (thickness < height){
            thickness *= 2;
            count++;
        }
        System.out.println("折叠了"+count+"次");
    }
}
