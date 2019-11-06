package six.test;

import six.pojo.Student;
import six.pojo.Teacher;
import six.service.Sport;
import six.service.impl.SportStudent;
import six.service.impl.SportTeacher;

public class Test {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("45","马云");

        SportTeacher teacher2 = new SportTeacher("35","大姚");

        Student student = new Student("20","小王");


        SportStudent student2 = new SportStudent("21","王中王");

        goToSport(teacher2);
        goToSport(student2);
    }

    public static void goToSport(Sport sport){
            sport.playBasketball();
    }
}
