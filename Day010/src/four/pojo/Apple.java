package four.pojo;

public class Apple {
    private double Big;
    private String color;

    public Apple() {
    }

    public Apple(double big, String color) {
        Big = big;
        this.color = color;
    }

    public double getBig() {
        return Big;
    }

    public void setBig(double big) {
        Big = big;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
