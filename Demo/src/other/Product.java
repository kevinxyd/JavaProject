package other;

public class Product implements Runnable {

    private int index;
    private BaoZi baoZi;

    public Product(int index, BaoZi baoZi) {
        this.index = index;
        this.baoZi = baoZi;
    }

    public Product(BaoZi baoZi) {
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            if (baoZi != null){
                synchronized (baoZi) {
                    if (baoZi != null) {
                        if (baoZi.getFlag() % 2 == 0) {
                            baoZi.setName("叉烧包");
                            baoZi.setPrice(1.0);
                            baoZi.setFlag(1);
                            System.out.println("生产了一个" + baoZi.getPrice());
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
