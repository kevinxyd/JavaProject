package five.test;

import five.pojo.Animal;
import five.pojo.Cat;
import five.pojo.Dog;

public class Test {
    public static void main(String[] args) {
        Animal d = new Dog("狗","100");
        d.eat();
        Animal c = new Cat("猫","50");
        c.eat();
        if (d instanceof Dog){
            Dog dog = (Dog) d;
            dog.lookHome();
        }
        if (c instanceof Cat){
            Cat cat = (Cat) c;
            cat.catchMouse();
        }
    }
}
