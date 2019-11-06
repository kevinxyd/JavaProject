package top10;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        new Thread(() -> {
            while (true){
                synchronized (person){
                    try {
                        person.setName("1");
                        person.setSex("1");
                        System.out.println(Thread.currentThread().getName());
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"赋值").start();

        new Thread(() -> {
            while (true){
                synchronized (person){
                    try {
                        Thread.sleep(500);
                        System.out.println(Thread.currentThread().getName() + person.getName() + person.getSex());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    person.notify();
                }
            }
        },"打印").start();
    }
}
