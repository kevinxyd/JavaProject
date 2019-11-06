package com.day4.two;

public class Test3 {
    public static void main(String[] args) {
        int[] nums={5,10,15};
        int[] newArr=new int[3];
        System.out.println("nums数组：");
        getNums(nums,newArr);
        System.out.println("\n"+"newArr数组：");
        getNewArr(newArr);

    }
    //遍历nums数组并赋值newArr
    public static void getNums(int[] nums,int[] newArr){
        for (int i = 0; i < nums.length; i++) {
            newArr[i]=2*nums[i];
            System.out.print(nums[i]+" ");
        }
    }
    //遍历newArr数组
    public static void getNewArr(int[] newArr){
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
}
