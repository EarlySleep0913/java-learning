package com.earlysleep.ifDemo;

import java.util.Scanner;

public class ifDemo7 {
    public static void main(String[] args) {
    //计算BMI

        //键盘录入数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高：");
        double height = sc.nextDouble();

        //计算BMI
        double bmi = weight / (height * height);
        System.out.println("BMI：" + bmi);

        //判断身体状态和健康风险
        if (bmi < 18.5) {
            System.out.println("体重过轻");
            System.out.println("健康风险高");
        }
        else if (bmi >= 18.5 && bmi < 23.9) {
            System.out.println("正常");
            System.out.println("健康风险适中");
        }
        else if (bmi >= 23.9 && bmi < 26.9) {
            System.out.println("体重过重");
            System.out.println("健康风险高");
        }
        else if (bmi >= 26.9 && bmi < 29.9) {
            System.out.println("体重肥胖");
            System.out.println("健康风险中");
        }
        else if (bmi >= 29.9) {
            System.out.println("肥胖");
            System.out.println("健康风险高");
        }
        else {
            System.out.println(" 数据错误");
        }


    }
}
