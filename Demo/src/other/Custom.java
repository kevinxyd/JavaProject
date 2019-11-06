package other;

public class Custom implements Runnable {

    private int index;
    private BaoZi baoZi;

    public Custom(int index, BaoZi baoZi) {
        this.index = index;
        this.baoZi = baoZi;
    }

    public Custom(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            if (baoZi != null){
                synchronized (baoZi){
                    if (baoZi != null){
                        if (baoZi.getFlag() % 2 == 1){
                            System.out.println("已经买了一个" + baoZi.getName());
                            baoZi.setFlag(2);
                        }
                        try {
                            Thread.sleep(500);
                            baoZi.notify();
                            baoZi.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
