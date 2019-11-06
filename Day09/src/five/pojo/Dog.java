package five.pojo;

public class Dog extends Animal {

    public Dog(String name, String weight) {
        super(name, weight);
    }

    @Override
    public void eat() {
        System.out.println(getName()+"吃骨头");
    }
    //定义看家
    public void lookHome(){
        System.out.println("老老实实看家");
    }
}
