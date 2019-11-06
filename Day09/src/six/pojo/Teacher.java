package six.pojo;

public class Teacher extends Person {

    public Teacher(){
        super();
    }
    public Teacher(String name, String age) {
        super(name, age);
    }
    @Override
    public void eat() {
        System.out.println();
    }

}
