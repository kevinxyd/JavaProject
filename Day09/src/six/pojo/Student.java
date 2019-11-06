package six.pojo;

public class Student extends Person {
    public Student(String name, String age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("学生吃的方法");
    }
}
