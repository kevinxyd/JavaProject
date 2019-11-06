package top7;

public class Bus implements Runnable{
    private static int countPerson = 80;

    private static int limitCount = countPerson;

    @Override
    public void run() {
        while (true){
            synchronized (Bus.class){
                if (countPerson <= 0){
                    break;
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "上车第" + ((limitCount + 1) - countPerson) + "人,还剩" + countPerson + "座位");
                countPerson --;
            }
        }
    }

}
