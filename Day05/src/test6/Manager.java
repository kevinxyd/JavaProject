package test6;

public class Manager {
    private String name;//姓名
    private int jobnumber;//工号
    private double payroll;//薪资
    private double bunus;//奖金

    public Manager() {
    }

    public Manager(String name, int jobnumber, double payroll, double bunus) {
        this.name = name;
        this.jobnumber = jobnumber;
        this.payroll = payroll;
        this.bunus = bunus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJobnumber() {
        return jobnumber;
    }

    public void setJobnumber(int jobnumber) {
        this.jobnumber = jobnumber;
    }

    public double getPayroll() {
        return payroll;
    }

    public void setPayroll(double payroll) {
        this.payroll = payroll;
    }

    public double getBunus() {
        return bunus;
    }

    public void setBunus(double bunus) {
        this.bunus = bunus;
    }

    //打印姓名工号信息
    public void intro(){
        System.out.println("经理姓名："+name+"\n"+"工号："+jobnumber);
    }
    //打印姓名工号信息
    public void showSalary(){
        System.out.println("基本工资为："+payroll+"奖金为："+bunus);
    }
    //打印信息
    public void work(){
        System.out.println("正在努力的做着管理工作，分配任务，检查员工提交上来的代码。。。");
    }
}
