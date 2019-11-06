package top6;

public class Test {
    public static void main(String[] args) {
        WaterClass waterClass = new WaterClass();
        Thread thread1 = new Thread(waterClass,"实体店");
        Thread thread2 = new Thread(waterClass,"网店");
        thread2.start();
        thread1.start();
    }
}
