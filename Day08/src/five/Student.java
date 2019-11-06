package five;

public class Student extends Person {

    private float score;

    public Student() {
    }

    public Student(float score) {
        this.score = score;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    //考试方法
    public void exam(){
        System.out.println(getName()+"同学,考试得了"+score+"分");
    }

}
