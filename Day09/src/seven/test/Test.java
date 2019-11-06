package seven.test;

import seven.pojo.Coder;
import seven.pojo.Manager;
import seven.service.impl.Company;

public class Test {
    public static void main(String[] args) {
        //创建Manager对象
        Manager manager = new Manager("张小强",9000);
        //创建Coder对象
        Coder coder = new Coder("李小亮",5000);
        //创建Company对象
        Company company = new Company(1000000);
        //调用价格方法
        company.paySalary(manager);
        company.paySalary(coder);
    }
}
