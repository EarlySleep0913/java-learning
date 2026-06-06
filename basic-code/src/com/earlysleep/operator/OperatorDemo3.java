package com.earlysleep.operator;

import java.util.Scanner;

public class OperatorDemo3 {
    public static void main(String[] args) { 
    //实现字母大小写转换，将大写字母转成小写字母
        
        //键盘录入一个字符
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入一个字符：");
        // sc.next() 读取用户输入的下一个字符串（例如 "A"）
        // .charAt(0) 获取该字符串中索引为 0 的第一个字符（例如 'A'）
        // 因为 Scanner 没有直接读取单个 char 的方法，所以通常这样组合使用
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            //小写字母转大写字母
            char newCh = (char)(ch - 32);
            System.out.println(newCh);
        }
        else if (ch >= 'A' && ch <= 'Z') {
            //大写字母转小写字母
            char newCh = (char)(ch + 32);
            System.out.println(newCh);
        }
        else {
            System.out.println("输入的字符不是字母");
        }
    }
}
