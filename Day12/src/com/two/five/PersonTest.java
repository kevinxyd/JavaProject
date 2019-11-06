package com.two.five;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("第一人",54,1.60);
        Person person2 = new Person("第二人",21,1.70);
        Person person3 = new Person("第三人",57,1.60);
        Person person4 = new Person("第四人",51,1.80);
        Person person5 = new Person("第五人",13,1.56);

        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);

        Iterator<Person> iterator = list.iterator();
        System.out.println("姓名： " + "年龄：" + "身高：");
        while (iterator.hasNext()){
            Person person = iterator.next();
            person.setAge(person.getAge() + 2);
            System.out.println(person.getName() + "   " + person.getAge() + "   " +person.getHeight());
        }
    }
}
