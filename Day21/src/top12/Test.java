package top12;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<MyMethod> myMethodClass = MyMethod.class;
        Method method = myMethodClass.getMethod("test1");
        if (method.isAnnotationPresent(Book.class)){
            Book annotation = method.getAnnotation(Book.class);
            String value = annotation.value();
            double price = annotation.price();
            String[] authors = annotation.authors();
            System.out.println("书名：" + value + " 价格： " + price + " 作者：" + Arrays.toString(authors));
        }
    }
}
