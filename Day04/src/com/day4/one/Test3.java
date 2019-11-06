package com.day4.one;

public class Test3 {
    public static void main(String[] args) {
        int length=20,width=8;
        int zc=getPerimeter(length,width);
        int area=getArea(length,width);
        System.out.println("矩形周长"+zc);
        System.out.println("矩形周长"+area);

    }
    //计算矩形周长
    private static int getPerimeter(int length,int width) {
        return 2*(length+width);
    }
    //计算矩形面积
    private static int getArea(int length,int width) {
        return length*width;
    }

}
