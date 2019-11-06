package five;

public class Teacher extends Person {

    private String subject;

    public Teacher() {
    }
    public Teacher(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //讲课方法
    public void teach(){
        System.out.println(getName()+"老师,讲授了"+subject);
    }
}
