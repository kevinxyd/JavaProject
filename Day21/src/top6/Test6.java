package top6;

import top3.Student;

import java.lang.reflect.Field;

public class Test6 {
    //测试
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Test6 test6 = new Test6();
        Class<?> aClass = Class.forName("top3.Student");
        Student student = (Student) aClass.newInstance();
        //方法一赋值
        test6.setProperty(student,"name","张三");
        //方法二获得属性值
        Object name = test6.getProperty(student, "name");
        System.out.println(name);
    }
    //此方法可将obj对象中名为propertyName的属性的值设置为value
    public void setProperty(Object obj,String propertyName,Object value) {
        try {
            //获取名为propertyName的属性
            Field df = obj.getClass().getDeclaredField(propertyName);
            //访问private的属性
            df.setAccessible(true);
            //设置属性值
            df.set(obj,value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //此方法可以获取obj对象中名为propertyName的属性的值
    public Object getProperty(Object obj,String propertyName){
        Object name = null;
        try {
            //获取名为propertyName的属性
            Field df = obj.getClass().getDeclaredField(propertyName);
            //访问private的属性
            df.setAccessible(true);
            //获取属性值
            name = df.get(obj);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return name;
    }
}
