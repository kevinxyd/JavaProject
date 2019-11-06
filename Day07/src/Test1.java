
public class Test1 {
    public static void main(String[] args) {
        String str1=new String("你好");
        System.out.println("方式一创建的字符串："+str1);

        char[] chs={'h','e','l','l','o'};
        String str2=new String(chs);
        System.out.println("方式二创建的字符串："+str2);

        byte[] bytes={'a','b','c','d','e'};
        String str3=new String(bytes);
        System.out.println("方式三创建的字符串："+str3);

    }
}
