package two.pojo;

import java.util.ArrayList;

public class Subject {

    private String subjectName;
    private String teacherName;
    private ArrayList<Student> studentList;

    public Subject() {
    }

    public Subject(String subjectName, String teacherName, ArrayList studentList) {
        this.subjectName = subjectName;
        this.teacherName = teacherName;
        this.studentList = studentList;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList studentList) {
        this.studentList = studentList;
    }

    //打印课程信息
    public void show(){
        System.out.println("课程名称：" + getSubjectName() + "\n" + "授课老师：" + getTeacherName());
        for (Student s:studentList) {
            System.out.println(s.getAttendance() + ":" +s.getName());
        }
    }
}
