package top8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Test8 {
    public static void main(String[] args) {
        Student student1 = new Student("张三",80);
        Student student2 = new Student("李四",100);
        Student student3 = new Student("王五",75);
        Student[] students = {student1,student2,student3};
        new Thread(new Runnable() {
            @Override
            public void run() {
                Integer[] score = new Integer[students.length];
                for (int i = 0; i < students.length; i++) {
                    score[i] = students[i].getScore();
                }
                Arrays.sort(score, (o1, o2) -> o2 - o1);
                for (Integer d:score) {
                    System.out.println(d);
                }
            }
        }).start();
    }
}
