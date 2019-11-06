package test;


import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Test3 {
    @Test
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("bean.Test1");
        Field[] fields = aClass.getFields();
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c:constructors) {
            System.out.println(c);
        }
    }
}
