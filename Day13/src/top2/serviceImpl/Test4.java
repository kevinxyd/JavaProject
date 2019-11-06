package top2.serviceImpl;


import top2.serviceImpl.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test4 {
    public static void main(String[] args) {

        HashSet<Student> hashSet =new HashSet<>();

        Student student1 =new Student("张三",18,"男");
        Student student2 =new Student("李四",19,"男");
        Student student3 =new Student("王五",20,"女");
        Student student4 =new Student("赵六",22,"男");
        Student student5 =new Student("潘七",24,"男");
        Student student6 =new Student("莹莹",18,"女");
        Student student7 =new Student("张三",18,"男");
        Student student8 =new Student("李四",19,"男");
        Student student9 =new Student("张三",18,"男");
        Student student10 =new Student("琪琪",21,"女");

        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);
        hashSet.add(student6);
        hashSet.add(student7);
        hashSet.add(student8);
        hashSet.add(student9);
        hashSet.add(student10);
        Iterator<Student> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
            System.out.println("姓名："+student.getName()+" 年龄:"+student.getAge()+" 性别："+student.getSex());
        }
        for (Student student:hashSet) {
            System.out.println("姓名："+student.getName()+" 年龄:"+student.getAge()+" 性别："+student.getSex());
        }


    }
}
