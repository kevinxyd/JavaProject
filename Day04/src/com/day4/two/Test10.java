package com.day4.two;

public class Test10 {
    public static void main(String[] args) {
        int[] arr={99,100,98,97,96};
        System.out.println("最终得分："+getAvg(arr));
    }
    //找出最高分
    public static int getMax(int[] arr){
        int num=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(num<arr[i]){
                num=arr[i];
            }
        }
        return num;
    }
    //找出最低分
    public static int getMin(int[] arr){
        int num=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(num>arr[i]){
                num=arr[i];
            }
        }
        return num;
    }
    //计算平均分
    public  static  int  getAvg(int[] arr){
        //五个评委的分数和
        int num=0;
        for (int i = 0; i < arr.length; i++) {
            num+=arr[i];
        }
        return (num-getMax(arr)-getMin(arr))/(arr.length-2);
    }
}
