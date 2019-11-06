package top3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //第一种反射方法创建对象
        Class<?> aClass = Class.forName("top3.Student");
        Student student = (Student) aClass.newInstance();
        System.out.println(student);
        //第二种反射方法创建对象
        //反射指定参数构造方法
        Constructor<?> dc = aClass.getDeclaredConstructor(String.class, Integer.class);
        //创建对象并赋值
        Student student1 = (Student) dc.newInstance("张三", 15);
        System.out.println(student1);
    }
}
