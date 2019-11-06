package five;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setName("王小平");
        teacher.setSubject("Java课");
        teacher.teach();

        Student student = new Student();
        student.setName("李小乐");
        student.setScore(90);
        student.exam();
    }
}
