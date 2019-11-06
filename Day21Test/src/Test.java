import bean.Test1;
import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
//反射
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        /*Class<Test1> test1Class = Test1.class;
        System.out.println(test1Class);


        Test1 test1 = new Test1();
        Class<? extends Test1> aClass = test1.getClass();
        System.out.println(aClass);*/

        Class<?> aClass1 = Class.forName("bean.Test1");
        Constructor<?>[] constructors = aClass1.getConstructors();
        for (Constructor c:constructors) {
            System.out.println(c);
        }
        Constructor<?> declaredConstructors = aClass1.getDeclaredConstructor(String.class);
        declaredConstructors.setAccessible(true);
        Test1 test1 = (Test1) declaredConstructors.newInstance("ni");
        System.out.println(test1);
        /*System.out.println(aClass1.getName() + aClass1.getSimpleName());

        Test1 o = (Test1)aClass1.newInstance();

        System.out.println(o.toString());*/
    }
}

