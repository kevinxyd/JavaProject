package test6;

public class CoderManagerTest {
    public static void main(String[] args) {
        //实例化Manager对象并赋值
        Manager manager=new Manager("James",9527,15000,3000);
        //实例化Coder对象并赋值
        Coder coder=new Coder("Kode",0025,10000);
        //调用Manager中的方法
        manager.intro();
        manager.showSalary();
        manager.work();
        System.out.println("==============");
        //调用Coder中的方法
        coder.intro();
        coder.showSalary();
        coder.work();
    }
}
