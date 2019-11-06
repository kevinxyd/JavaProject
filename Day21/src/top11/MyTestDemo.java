package top11;

public class MyTestDemo {

    @MyTest
    public void test1(){
        System.out.println("我使用了MyTest注解");
    }

    public void test2(){
        System.out.println("2");
    }

    @MyTest
    public void test3(){
        System.out.println("我也使用了MyTest注解");
    }
}
