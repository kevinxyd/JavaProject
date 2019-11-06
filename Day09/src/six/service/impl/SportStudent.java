package six.service.impl;

import six.pojo.Student;
import six.service.Sport;

public class SportStudent extends Student implements Sport {

    public SportStudent(String name, String age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+" "+getName()+"的学生在打篮球");
    }
}
