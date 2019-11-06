package bean;


public class Test1 {
    private String name;
    private int age;

    public Test1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Test1() {
    }
    private Test1(String name){
        this.name = name;
    }
    private Test1(int age, String name) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
