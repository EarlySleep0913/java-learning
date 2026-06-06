package com.earlysleep.variable;

public class VariableDemo5_BMI {
    public static void main(String[] args) {

        //计算BMI
        double weight = 82.5;
        double height = 1.78;
        double bmi = weight / (height * height);

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
