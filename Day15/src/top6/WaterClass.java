package top6;


public class WaterClass implements Runnable{
    private static int count = 100;

    private static int limitCount = count;

    @Override
    public void run() {
        while (true){
            synchronized (WaterClass.class){
                if (count <= 0){
                    break;
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "正在卖" + ((limitCount + 1) - count) + "个水杯,共剩余" + (count-1));
                count --;
            }
        }
    }

}
