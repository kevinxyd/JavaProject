package com.two.two;

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

        Person maxHeightPerson = list.get(0);
        Person minHeightPerson = list.get(0);
        while (iterator.hasNext()){
            Person person = iterator.next();
            //判断最高的人
            maxHeightPerson = person.getHeight() > maxHeightPerson.getHeight() ? person : maxHeightPerson ;
            //判断最矮的人
            minHeightPerson = person.getHeight() < minHeightPerson.getHeight() ? person : maxHeightPerson ;
        }
        System.out.println("最高的人是" + maxHeightPerson.getName() + " 身高是：" +maxHeightPerson.getHeight());
        System.out.println("最矮的人是" + minHeightPerson.getName() + " 身高是：" +minHeightPerson.getHeight());
    }
}
