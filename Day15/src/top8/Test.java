package top8;

import top7.Bus;

public class Test {
    public static void main(String[] args) {
        Ricket ricket = new Ricket();
        Thread thread1 = new Thread(ricket,"窗口一");
        Thread thread2 = new Thread(ricket,"窗口二");
        Thread thread3 = new Thread(ricket,"窗口三");
        Thread thread4 = new Thread(ricket,"窗口四");
        thread2.start();
        thread1.start();
        thread3.start();
        thread4.start();
    }
}
