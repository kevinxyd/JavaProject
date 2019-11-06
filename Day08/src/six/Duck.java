package six;

public class Duck extends Animal {

    //重写eat方法
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在吃饭");
    }
    //游泳的方法
    public void swimMing() {
        System.out.println(getAge()+"岁的"+getColor()+"的鸭子在游泳");
    }
}
