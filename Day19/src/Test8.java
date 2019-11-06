import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("stu.txt"));
        Student stu = (Student)objectInputStream.readObject();
        System.out.println(stu.getName() + stu.getAge() + stu.getSex());
    }
}
