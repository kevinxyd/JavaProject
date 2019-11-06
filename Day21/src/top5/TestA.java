package top5;

import java.util.Scanner;

public class TestA {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);
        String className = scanner.next();
        //利用反射创建A对象
        Class<?> aClass = Class.forName(className);
        //创建对象
        A o = (A) aClass.newInstance();
        //调用方法
        o.showString();
    }
}
