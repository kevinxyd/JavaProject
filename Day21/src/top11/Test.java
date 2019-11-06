package top11;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<MyTestDemo> mtc = MyTestDemo.class;
        MyTestDemo myTestDemo = mtc.newInstance();
        Method[] methods = mtc.getMethods();
        for (Method m:methods) {
            if (m.isAnnotationPresent(MyTest.class)){
                m.invoke(myTestDemo);
            }
        }
    }
}
