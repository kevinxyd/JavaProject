import java.util.ArrayList;

public class Test9 {

    public static void main(String[] args) {
       ArrayList<String> list=new ArrayList<>();
        ArrayList<String> list1=new ArrayList<>();
        String a="ABCD";
        String b="ACBD";
        for (int i = 0; i < a.length(); i++) {
            list.add(a.substring(i,i+1));
            java.util.Collections.sort(list);
        }
        for (int i = 0; i < b.length(); i++) {
            list1.add(b.substring(i,i+1));
            java.util.Collections.sort(list1);
        }
        System.out.println(a+"排序后的内容"+list);
        System.out.println(b+"排序后的内容"+list1);

        String s=String.join(",",list);
        String s2=String.join(",",list1);
        if (s.equals(s2)){
            System.out.println("该元素为兄弟元素");
        } else {
            System.out.println("该元素不是兄弟元素");
        }
    }
}
