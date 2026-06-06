package com.earlysleep.variable;

import java.util.Scanner;

public class VariableDemo8 {
    public static void main(String[] args) {

        //键盘录入 数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        //计算BMI
        double bmi = weight / (height * height);

        System.out.println("BMI:" + bmi);

        //通过BMI判断自己的身体状态和健康风险
        if (bmi < 18.5) {
            System.out.println("体重过轻");
            System.out.println("健康风险高");
        }
        else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("正常");
            System.out.println("健康风险低");
        }
        else if (bmi >= 24.9 && bmi < 29.9) {
            System.out.println("体重过重");
            System.out.println("健康风险中");
        }
        else if (bmi >= 29.9 && bmi < 34.9) {
            System.out.println("肥胖");
            System.out.println("健康风险高");
        }
        else {
            System.out.println(" severely obese");
            System.out.println("健康风险最高");
        }


        //计算当前身高在标准的BMI中，体重的范围
        double bmi1=18.5;
        double bmi2=24.9;
        double weightmin;
        double weightmax;
        weightmin = bmi1 * (height * height);
        weightmax = bmi2 * (height * height);
        System.out.println("BMI在18.5-24.9之间的身高为" + height + "时，体重范围是" + weightmin + "到" + weightmax);
    }
}
