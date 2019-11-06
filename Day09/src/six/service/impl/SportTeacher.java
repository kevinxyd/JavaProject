package six.service.impl;

import six.pojo.Teacher;
import six.service.Sport;

public class SportTeacher extends Teacher implements Sport {

    public SportTeacher(){
        super();
    }

    public SportTeacher(String name, String age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+getAge()+" "+getName()+"的老师再打篮球");
    }
}
