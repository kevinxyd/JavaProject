package top11;

import java.util.Random;

public class ThreadTest implements Runnable {

    private Integer limitNumber = 100 ;
    private Integer number = limitNumber;
    private DoubleColorBallUtil doubleColorBallUtil = new DoubleColorBallUtil();
    private int beforeDor = 0;
    private int afterDor = 0;
    private Object object = new Object();

    public int getBeforeDor() {
        return beforeDor;
    }

    public void setBeforeDor(int beforeDor) {
        this.beforeDor = beforeDor;
    }

    public int getAfterDor() {
        return afterDor;
    }

    public void setAfterDor(int afterDor) {
        this.afterDor = afterDor;
    }

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (limitNumber <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                    if (Thread.currentThread().getName().equals("前门")){
                        setBeforeDor(getBeforeDor() + 1);
                    } else if (Thread.currentThread().getName().equals("后门")){
                        setAfterDor(getAfterDor() + 1);
                    }
                    System.out.println("编号为：" +((number + 1) - limitNumber) +
                            "的员工从" + Thread.currentThread().getName() + "入场！拿到的双色球彩票号码是" +
                            doubleColorBallUtil.create());
                    limitNumber -- ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("从后门入场的员工共：" + getAfterDor() + "位员工" + "从前门入场的员工共：" + getBeforeDor() + "位员工");


    }
}
