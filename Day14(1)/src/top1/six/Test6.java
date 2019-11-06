package top1.six;

import top1.six.bean.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test6 {
    public static void main(String[] args) {
        HashMap<Student, String> hashMap = new HashMap<>();
        hashMap.put(new Student("zhangsan",14),"guangzhou");
        hashMap.put(new Student("lisi", 16), "shanghai");
        Set<Student> keySet = hashMap.keySet();
        for (Student s:keySet) {
            System.out.println("姓名： " + s.getName() + "年龄： " +s.getAge() + " 地址" + hashMap.get(s));
        }

        Set<Map.Entry<Student, String>> entrySet = hashMap.entrySet();
        for (Map.Entry<Student,String> s:entrySet) {
            System.out.println("姓名： " + s.getKey().getName() + "年龄： " + s.getKey().getAge() + " 地址" + s.getValue());
        }
    }
}
