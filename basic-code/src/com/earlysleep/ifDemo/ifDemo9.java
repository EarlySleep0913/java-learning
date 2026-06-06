package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo9 {
    public static void main(String[] args) {
    //直角坐标系位置判断
        //输入变量x，y
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入x：");
        int x = sc.nextInt();
        System.out.println("请输入y：");
        int y = sc.nextInt();

        //判断所在区域
        if(x > 0 && y > 0){
            System.out.println("在第一象限");
        }
        else if(x < 0 && y > 0){
            System.out.println("在第二象限");
        }
        else if(x < 0 && y < 0){
            System.out.println("在第三象限");
        }
        else if(x > 0 && y < 0){
            System.out.println("在第四象限");
        }
        else if(x == 0 && y != 0){
            System.out.println("在X轴上");
        }
        else if(x != 0 && y == 0){
            System.out.println("在Y轴上");
        }
        else if(x == 0 && y == 0){
            System.out.println("在原点");
        }
        else{
            System.out.println("输入错误");
        }
    }
}
