import com.pojo.Student;

import java.util.ArrayList;

public class Test5 {

    public static void main(String[] args) {

        Student s1=new Student("it001","黄渤",1.72);
        Student s2=new Student("it002","孙红雷",1.78);
        Student s3=new Student("it003","章子怡",1.64);
        Student s4=new Student("it004","杨颖",1.68);

        ArrayList<Student> list=new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        //打印集合大小
        System.out.println("集合大小:"+list.size());
        //遍历集合
        for (Student stu:list) {
            System.out.println(stu.getId()+","+stu.getName()+","+stu.getHeight());
        }
        System.out.println("---------------------------");
        System.out.println("身高在1.70以上的信息:");
        //遍历集合，打印身高在1.70以上的信息
        for (Student stu:list) {
            if (stu.getHeight() > 1.70){
                System.out.println(stu.getId()+","+stu.getName()+","+stu.getHeight());
            }
        }
    }


}
