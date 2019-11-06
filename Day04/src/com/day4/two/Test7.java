package com.day4.two;

public class Test7 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        int[] arr2={1,2,3,4,2,1};
        //分别遍历数组arr和arr2
        for (int i = 0; i < arr.length -1;i++) {
            System.out.print(arr[i] + ",");
        }
        //去除最后一个，号
        System.out.print(arr[arr.length -1]);
        System.out.println();
        //同上
        for (int i = 0; i < arr2.length -1;i++) {
            System.out.print(arr2[i] + ",");
        }
        System.out.print(arr2[arr2.length -1]);
        System.out.println("是否一致:"+equals(arr,arr2));
    }
    //判断两个数组是否完全相等
    public static boolean equals(int[] arr,int[] arr2){
        //定义相等次数
        int count=0;
        //判断长度是否相等
        if (arr.length!=arr2.length) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
            return true;
    }
}
