package two.test;


import two.pojo.Student;
import two.pojo.Subject;
import two.pojo.Teacher;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //声明集合
        ArrayList<Student> list = new ArrayList<>();
        //创建Student并赋值
        Student student1 = new Student("小红","上课");
        Student student2 = new Student("小亮","上课");
        Student student3 = new Student("小明","旷课");
        //将Student添加到集合
        list.add(student1);
        list.add(student2);
        list.add(student3);

        //创建Teacher并赋值
        Teacher teacher = new Teacher("张老师");
        //创建Subject并赋值
        Subject subject = new Subject("Java",teacher.getName(),list);
        //展示信息
        subject.show();
    }
}
