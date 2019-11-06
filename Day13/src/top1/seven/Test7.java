package top1.seven;

import top1.seven.bean.Person;

import java.util.HashSet;

public class Test7 {
    public static void main(String[] args) {

        HashSet<Person> hashSet =new HashSet<>();
        Person person1 =new Person("张三",18);
        Person person2 =new Person("李四",19);
        Person person3 =new Person("王五",20);
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);

        for (Person person:hashSet) {
            System.out.println("姓名: "+person.getName()+" 年龄："+person.getAge());
        }
    }
}
