package com.day4.two;

public class Test5 {
    public static void main(String[] args) {
        int[] arr={95,92,75,56,98,71,80,58,91,91};
        int avg=getAvg(arr);//平均分
        int count=0;
        //计数器
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>avg){
                count++;
            }
        }
        System.out.println("高于平均分："+avg+"的个数有"+count+"个");
    }
    //计算平均分
    private static int getAvg(int[] arr) {
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum/10;
    }
}
