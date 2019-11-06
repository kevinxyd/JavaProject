package top9;

import top8.Test8;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Set;

public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        File file = new File("top9.properties");
        if (file.exists()){
            Properties properties = new Properties();
            properties.load(Test8.class.getResourceAsStream("/top8.properties"));
            String classname = properties.getProperty("class");
            Class aClass = Class.forName(classname);
            Object o = aClass.newInstance();
            Set<String> strings = properties.stringPropertyNames();
            for (String s:strings) {
                if (s.equals("class")){
                    continue;
                }
                //属性值
                String value = properties.getProperty(s);
                if (value == null){

                }
            }
        } else {
            file.createNewFile();
        }
    }
}
