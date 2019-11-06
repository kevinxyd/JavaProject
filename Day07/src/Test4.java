import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        String str="HelloWorld";
        for (char cha:str.toCharArray()) {
            System.out.println(cha);
        }
        System.out.println("将str字符串转换为小写："+str.toLowerCase());
        System.out.println("将str字符串转换为大写："+str.toUpperCase());
        System.out.println("将str字符串中的字符o替换成6:"+str.replace('o','6'));
        System.out.println("将str字符串中的字符串ll替换成LL："+str.replace("ll","LL"));
    }
}
