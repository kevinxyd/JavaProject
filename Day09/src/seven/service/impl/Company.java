package seven.service.impl;

import seven.pojo.Employee;
import seven.service.Money;

public class Company implements Money {

    private float totalSalary;

    public Company() {
    }

    public Company(float totalSalary) {
        this.totalSalary = totalSalary;
    }

    public float getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(float totalSalary) {
        this.totalSalary = totalSalary;
    }
    //实现接口方法
    @Override
    public void paySalary(Employee employee) {
        //每次调用方法减去工资
        totalSalary=totalSalary-employee.getPay();
        System.out.println("给"+employee.getName()+"发工资 "+employee.getPay()+"元，公司剩余 "+totalSalary+"元" );
    }
}
