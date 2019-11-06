package top2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> list = new ArrayList<>();
        //通过反射获取list的add方法
        Method listAddMeth = list.getClass().getMethod("add", Object.class);
        //向集合中添加String类型的数据
        listAddMeth.invoke(list,"我是String类型");
        System.out.println(list);
    }
}
