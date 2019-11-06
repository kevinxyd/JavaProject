package eight;

public class Test {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setId("666");
        lecturer.setName("傅红雪");
        lecturer.work();

        Tutor tutor = new Tutor();
        tutor.setId("668");
        tutor.setName("顾棋");
        tutor.work();

        Maintainer maintainer = new Maintainer();
        maintainer.setId("686");
        maintainer.setName("庖丁");
        maintainer.work();

        Buyer buyer = new Buyer();
        buyer.setId("888");
        buyer.setName("景甜");
        buyer.work();
    }
}
