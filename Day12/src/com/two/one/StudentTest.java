package com.two.one;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("小明",18,98);
        Student student2 = new Student("小兰",45,50);
        Student student3 = new Student("小红",6,87);
        Student student4 = new Student("阿兰",8,25);
        Student student5 = new Student("阿虎",17,100);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        Iterator<Student> iterator = list.iterator();
        int sumScore = 0;
        double maxScore = list.get(0).getScore();
        double minScore = list.get(0).getScore();
        //定义成绩集合
        while (iterator.hasNext()){
            //计算总分
            Student student = iterator.next();
            double score = student.getScore();
            sumScore += score ;
            maxScore = student.getScore() > maxScore ? student.getScore() : maxScore ;
            minScore = student.getScore() < minScore ? student.getScore() : minScore ;
        }
        System.out.println("平均分：" + sumScore/5);
        System.out.println("总分：" + sumScore);
        System.out.println("最高分：" + maxScore);
        System.out.println("最低分：" + minScore);
    }
}
