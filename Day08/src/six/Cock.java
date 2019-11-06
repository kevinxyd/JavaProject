package six;

public class Cock extends Animal {

    //重写eat方法
    @Override
    public void eat() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在啄米");
    }
    //打鸣
    public void crow() {
        System.out.println(getAge()+"岁的"+getColor()+"的公鸡在打鸣");
    }
}
