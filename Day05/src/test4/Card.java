package test4;

public class Card {
    private String flowerColor;
    private String count;

    public Card(String flowerColor, String count) {
        this.flowerColor = flowerColor;
        this.count = count;
    }

    public String getHuase() {
        return flowerColor;
    }

    public void setHuase(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getDianshu() {
        return count;
    }

    public void setDianshu(String count) {
        this.count = count;
    }

    public void showCard(){
        System.out.println(flowerColor+count);
    }
}
