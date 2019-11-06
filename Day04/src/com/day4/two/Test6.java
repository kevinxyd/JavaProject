package com.day4.two;

public class Test6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        for (int i = 0; i < arr.length -1;i++)
        {
            System.out.print(arr[i] + ",");
        }
        System.out.print(arr[arr.length -1]+"]是否对称："+decide(arr));
    }
    //首尾判断元素是否对称
    private static boolean decide(int[] arr) {
        //定义首尾元素相等的次数
        int count=0;
        for (int i = 0,j=arr.length-1; i < arr.length; i++,j--) {
            if (arr[i]==arr[j]){
                count++;
            }
        }
        //相等的次数是否与数组长度相同
        if (count==arr.length){
            return true;
        } else {
            return false;
        }
    }
}
