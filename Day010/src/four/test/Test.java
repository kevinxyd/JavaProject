package four.test;

import four.pojo.Apple;
import four.pojo.Worker;
import four.service.CompareAble;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker worker = new Worker();
        Apple apple1 = new Apple(5,"青色");
        Apple apple2 = new Apple(3,"红色");
        CompareAble compareAble = new CompareAble() {
            @Override
            public Apple cpmpare(Apple apple, Apple apple2) {
                return apple;
            }
        };
        Apple apple = worker.pickApple(compareAble,apple1,apple2);
        System.out.println("默认挑大的：" + "\n" + apple.getBig() + "-" +apple.getColor());
        compareAble.cpmpare(apple1,apple2);
        System.out.println("挑红的：" + "\n" + apple2.getBig() + "-" +apple2.getColor());


    }
}
