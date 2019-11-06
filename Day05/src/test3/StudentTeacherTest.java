package test3;

public class StudentTeacherTest {
    public static void main(String[] args) {
        //实例化Teacher对象
        Teacher t=new Teacher();
        //给对象赋值
        t.setName("周老师");
        t.setAge(30);
        t.setContent("java面向对象");
        //调用方法
        t.eat();
        t.teach();
        //实例化学生对象并赋值
        Student stu=new Student("韩同学",18,t.getContent());
        //调用方法
        stu.eat();
        stu.study();
    }
}
