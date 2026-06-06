package com.earlysleep.SwitchDemo;

public class SwitchDemo2 {
    public static void main(String[] args) {
        //**switch的扩展知识：**
        //箭头标签
        //不加break也不会进行case穿透
        int number = 3;
        switch (number){
            case 1 -> System.out.println("星期一");
            case 2 -> System.out.println("星期二");
            case 3 -> System.out.println("星期三");
            default -> System.out.println("输入的数字有误");
        }
        System.out.println("____________");

        //case后可加多个标签
        int a = 3;
        switch (a){
            case 1,2 -> System.out.println("星期一");
            case 3,4 -> System.out.println("星期二");
            case 5,6 -> System.out.println("星期三");
            default -> System.out.println("输入的数字有误");
        }
        System.out.println("____________");

        //switch可以有运行结果
        //yield关键字


    }
}
