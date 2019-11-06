package three;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.eat();
        dog.lookHome();
        System.out.println("---------");
        Cat cat = new Cat();
        cat.name = "波斯";
        cat.eat();
        cat.catchMouse();
    }
}
