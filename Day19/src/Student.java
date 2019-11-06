import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = 8115868232879634388L;

    public String name;
    public Integer age;
    public String sex;
    transient String i;

    public Student() {
    }

    public Student(String name, Integer age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
