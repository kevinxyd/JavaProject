import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Test11 {
    public static void main(String[] args) throws IOException {

        List<Student> list = new ArrayList<>();
        Student student1 = new Student("张三", 14, "男");
        Student student2 = new Student("李四", 13, "男");
        Student student3 = new Student("王五", 15, "男");
        Student student4 = new Student("小红", 15, "女");
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("stus.txt"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
    }
}
