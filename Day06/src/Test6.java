import com.pojo.Teacher;

import java.util.ArrayList;

public class Test6 {
    public static void main(String[] args) {
        Teacher t1=new Teacher("姚小明",23,"打篮球");
        Teacher t2=new Teacher("景甜",20,"打羽毛球");
        Teacher t3=new Teacher("薛之谦",45,"踢足球");

        ArrayList<Teacher> list=new ArrayList<>();
        //添加信息
        list.add(t1);
        list.add(t2);
        list.add(t3);
        //遍历信息
        for (Teacher teacher:list) {
            System.out.println(teacher.getName()+","+teacher.getAge()+","+teacher.getLike());
        }
        System.out.println("----------");
        //遍历年龄大于40的对象的爱好改为高尔夫
        for (Teacher teacher:list) {
            if (teacher.getAge() > 40){
                teacher.setLike("高尔夫");
                System.out.println(teacher.getName()+","+teacher.getAge()+","+teacher.getLike());
            }
        }
    }
}
