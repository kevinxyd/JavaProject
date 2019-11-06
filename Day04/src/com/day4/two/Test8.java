package com.day4.two;

public class Test8 {
    public static void main(String[] args) {
        char[] biaozhun={'A','D','B','C','D'};//标准答案
        char[] xiaoming={'D','C','B','A','D'};//小明答案
        char[] xiaohong={'A','D','B','C','D'};//小红答案
        char[] xiaohuang={'A','D','B','C','A'};//小黄答案
        char[] xiaoqiang={'A','B','C','D','D'};//小强答案

        System.out.println("满分10分，"+"小明得分："+equals(biaozhun,xiaoming)+"分");
        System.out.println("满分10分，"+"小红得分："+equals(biaozhun,xiaohong)+"分");
        System.out.println("满分10分，"+"小黄得分："+equals(biaozhun,xiaohuang)+"分");
        System.out.println("满分10分，"+"小强得分："+equals(biaozhun,xiaoqiang)+"分");
    }
    //判断对错并返回考试分数
    public static int equals(char[] biaozhun,char[] kaoshi){
        //记录分数
        int score=0;
        //记录共做对多少题
        int count=0;
        for (int i = 0; i < biaozhun.length; i++) {
            if (biaozhun[i]==kaoshi[i]){
                count++;
            }
        }
        return 2*count;
    }
}
