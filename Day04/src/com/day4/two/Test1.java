package com.day4.two;

public class Test1 {
    public static void main(String[] args) {
        int[] arr={12,33,25,6,16};
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < min){
                min=arr[i];
            }
        }
        System.out.println("数组最小值"+min);
    }
}
