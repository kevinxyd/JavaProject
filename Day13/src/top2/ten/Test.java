package top2.ten;


import top2.ten.bean.Student;

import java.util.HashSet;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {

        HashSet<Student> hashSet = new HashSet<>();
        Student student1 = new Student("学生一",18,56.5);
        Student student2 = new Student("学生二",14,26.5);
        Student student3 = new Student("学生三",15,76.5);
        Student student4 = new Student("学生四",16,56.5);
        Student student5 = new Student("学生五",17,86.5);

        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student4);
        hashSet.add(student5);

        Iterator<Student> iterator = hashSet.iterator();
        //统计总分
        int totalScore = 0;
        double maxScore = 0;
        double minScore = 0;
        while (iterator.hasNext()){
            Student s = iterator.next();
            //总分
            totalScore += s.getScore();
            //最高分
            maxScore = s.getScore() > maxScore ? s.getScore() : maxScore;
            //最低分
            minScore = s.getScore() < maxScore ? s.getScore() : minScore;
            System.out.println(s.getName() + " " + s.getAge() + " " + s.getScore());
        }
        System.out.println("======================");
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分:" + minScore);
        System.out.println("平均分：" + totalScore/5);
    }
}
