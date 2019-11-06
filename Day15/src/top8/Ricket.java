package top8;

public class Ricket extends Thread{
    private static int countRicket = 1000;

    @Override
    public void run() {
        while (true){
            synchronized (Ricket.class){
                if (countRicket <= 0){
                    break;
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + "卖了一张票,还剩票数为" + (countRicket-1));
                countRicket --;
            }
        }
    }

}
