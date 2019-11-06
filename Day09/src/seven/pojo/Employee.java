package seven.pojo;

public class Employee {
    private String name;
    private float pay;

    public Employee() {
    }

    public Employee(String name, float pay) {
        this.name = name;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }
}
