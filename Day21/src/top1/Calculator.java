package top1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Calculator {
    public static int counta = 10;
    public static int countb = 5;


    @Test
    //加法
    public void add(){
        System.out.println("加法" + (counta + countb));
    }
    @Test
    //乘法
    public void ride(){
        System.out.println("乘法" + (counta * countb));
    }
    @Test
    //除法
    public void except(){
        if (countb != 0){
            System.out.println("除法" + (counta/countb));
        } else {
            System.out.println("被除数不能为0");
        }
    }
    @Test
    //减法
    public void subtract(){
        System.out.println("减法" + (counta - countb));
    }
    @Before
    //所有方法运行前创建对象
    public  void createCalculator(){
        Calculator calculator = new Calculator();
    }

    @After
    //所有方法结束后将对象设为空
    public void initializeCalculator() {
        Calculator calculator = null;
    }
}
