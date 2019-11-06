package top3;

import top3.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        //班级一集合
        HashSet<Student> hashSet1 = new HashSet<>();
        Student student1 = new Student("学生一",15);
        Student student2 = new Student("学生二",13);
        Student student5 = new Student("学生二",13);
        hashSet1.add(student1);
        hashSet1.add(student2);
        hashSet1.add(student5);

        //班级二集合
        HashSet<Student> hashSet2 = new HashSet<>();
        Student student3 = new Student("学生三",16);
        Student student4 = new Student("学生四",18);
        hashSet2.add(student3);
        hashSet2.add(student4);

        //学科集合
        HashSet<HashSet> hashSets = new HashSet<>();
        hashSets.add(hashSet1);
        hashSets.add(hashSet2);

        Iterator<HashSet> iterator = hashSets.iterator();
        while (iterator.hasNext()){
            HashSet<Student> ha = iterator.next();
            for (Student hashSet : ha) {
                System.out.println(hashSet.getName() + " " + hashSet.getAge());
            }
        }

    }
}
