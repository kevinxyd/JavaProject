package top4;

public class Test4 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("top4.NoName");
        //创建NoName对象
        NoName o = (NoName) aClass.newInstance();
        //调用show方法
        o.show();
    }
}
