public class Test1 {

    public static void main(String[] args) {
        //定义一个学生的考试成绩
        int score=19;
        //成绩小于0或者大于100
        if (score < 0 || score > 100){
            System.out.println("成绩有误");
        }else if (score>=90 && score<=100){//成绩大于90且小于100
            System.out.println("优秀");
        }else if (score >= 80 && score < 90){//成绩大于80且小于80
            System.out.println("好");
        }else if (score >= 70 && score < 80){//成绩大于70且小于80
            System.out.println("良");
        }else if (score >= 60 && score < 70){//成绩大于60且小于70
            System.out.println("及格");
        }else if (score < 60){//成绩小于60
            System.out.println("差");
        }
    }

}
