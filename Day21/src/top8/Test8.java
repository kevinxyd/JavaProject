package top8;


import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        properties.load(Test8.class.getResourceAsStream("/top8.properties"));
        String classname = properties.getProperty("class");
        Class aClass = Class.forName(classname);
        Object o = aClass.newInstance();
        Method method = aClass.getMethod("run");
        method.invoke(o);

    }
}
