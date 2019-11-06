package test5;

public class Circle {
    private int r;//定义半径

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    //定义圆面积
    public void showArea(){
        System.out.println("半径为："+r+",面积为："+3.14*r*r);
    }
    //定义圆周长
    public void showPerimeter(){
        System.out.println("半径为："+r+",周长为："+2*3.14*r);
    }
}
