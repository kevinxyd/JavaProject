package seven;

public class Manager extends Staff {
    //重写工作方法
    @Override
    public void job() {
        System.out.println("工号为："+getJobNumber()+"，姓名为："+getName()+",工资为："+getPayRoll()+"的经理在工作，管理其他人");
    }
    //重写吃饭方法
    @Override
    public void eat() {
        System.out.println("工号为："+getJobNumber()+"，姓名为："+getName()+",工资为："+getPayRoll()+"的经理在吃鱼");
    }
}
