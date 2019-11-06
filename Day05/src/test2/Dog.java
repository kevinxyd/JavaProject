package test2;

import java.io.PrintStream;

public class Dog {
    private String name;//名称
    private int age;//年龄

    public Dog() {

    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showMsg() {
        PrintStream out = System.out;
        out.println("狗的名称为：" + name + "，年龄为：" + age);
    }
}
