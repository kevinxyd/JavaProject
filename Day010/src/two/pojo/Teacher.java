package two.pojo;

public class Teacher {
    private String name;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //点名方法
    public void callTheRoll(Student student){
        System.out.println("出勤" + student.getAttendance());
    }
}
