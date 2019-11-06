package test6;

public class Coder {
    private String cname;//姓名
    private int cjobnumber;//工号
    private double cpayroll;//薪资

    public Coder() {
    }

    public Coder(String cname, int cjobnumber, double cpayroll) {
        this.cname = cname;
        this.cjobnumber = cjobnumber;
        this.cpayroll = cpayroll;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCjobnumber() {
        return cjobnumber;
    }

    public void setCjobnumber(int cjobnumber) {
        this.cjobnumber = cjobnumber;
    }

    public double getCpayroll() {
        return cpayroll;
    }

    public void setCpayroll(double cpayroll) {
        this.cpayroll = cpayroll;
    }

    //打印姓名工号信息
    public void intro(){
        System.out.println("程序员姓名："+cname+"\n"+"工号："+cjobnumber);
    }
    //打印姓名工号信息
    public void showSalary(){
        System.out.println("基本工资为："+cpayroll+"奖金无");
    }
    //打印信息
    public void work(){
        System.out.println("正在努力写代码。。。");
    }
}
