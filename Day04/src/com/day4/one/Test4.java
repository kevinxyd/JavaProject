package com.day4.one;

public class Test4 {
    public static void main(String[] args) {
        //定义一个变量接收
        char aChar= getChar(65);
        System.out.println("字符："+aChar);
    }

    private static char getChar(int num) {
        //将int数字转为char
        char ch=(char)(num);
        if (ch>=97 && ch <= 122){//小写字母范围
            return ch;
        } else if (ch >= 65 && ch <= 90){//大写字母范围
            return ch;
        } else if(ch >= 48 && ch <= 57){//数字判断
            return ch;
        } else {
            return ' ';
        }



    }
}
