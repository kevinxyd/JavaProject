package five.pojo;

public class Cat extends Animal {

    public Cat(String name, String weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃鱼");
    }
    //定义抓老鼠
    public void catchMouse(){
        System.out.println("努力抓老鼠");
    }
}
