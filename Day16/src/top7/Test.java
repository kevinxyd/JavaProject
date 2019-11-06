package top7;

import top7.service.Calculator;

public class Test {
    public static void main(String[] args) {
        //省略
        invokeCalc(120,130,(int a,int b) -> a-b);
        //标准
        invokeCalc(120, 130, (a, b) -> {
            return  a - b;
        });
    }
    private static void invokeCalc(int a,int b,Calculator calculator){
        int result = calculator.calc(a,b);
        System.out.println("结果是：" + result);
    }
}
