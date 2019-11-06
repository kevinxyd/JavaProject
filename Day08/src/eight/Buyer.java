package eight;

public class Buyer extends AdminStaff {
    @Override
    public void work() {
        System.out.println("工号为："+getId()+" "+"的采购员 "+getName()+" "+"在采购音响设备");
    }
}
