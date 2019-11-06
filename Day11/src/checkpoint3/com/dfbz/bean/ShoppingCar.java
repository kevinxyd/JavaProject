package checkpoint3.com.dfbz.bean;

public class ShoppingCar {

    private int num;
    private Good good;

    public ShoppingCar() {

    }

    public ShoppingCar(int num, Good good) {
        this.num = num;
        this.good = good;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    @Override
    public String toString() {
        return good.getName() + "    " + good.getPrice() + "    " + num + "    " + num * good.getPrice();
    }
}
