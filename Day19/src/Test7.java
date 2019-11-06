import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test7 {
    public static void main(String[] args) throws IOException {
        Student student = new Student();
        student.setName("ÕÅÈý");
        student.setAge(14);
        student.setSex("ÄÐ");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("stu.txt"));
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
    }
}
