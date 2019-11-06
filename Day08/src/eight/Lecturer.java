package eight;

public class Lecturer extends Teacher {
    //重写work方法
    @Override
    public void work() {
        System.out.println("工号为："+getId()+" "+"的讲师 "+getName()+" "+"在讲课");
    }
}
