package top7;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test7 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> aClass = Class.forName("top7.Person");
        Person person = (Person) aClass.newInstance();
        //调用有参构造方法，并初始化name age
        Constructor<?> dc = aClass.getDeclaredConstructor(String.class,Integer.class);
        Person person1 = (Person)dc.newInstance("李四",16);
        System.out.println(person1.getName() + person1.getAge());
        //调用setName方法并赋值
        Method setName = aClass.getMethod("setName", String.class);
        setName.invoke(person,"张三");
    }
}
