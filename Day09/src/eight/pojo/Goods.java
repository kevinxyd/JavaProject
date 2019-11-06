package eight.pojo;

public class Goods {
    private String productName;
    private String id;
    private float price;

    public Goods() {
    }

    public Goods(String productName, String id, float price) {
        this.productName = productName;
        this.id = id;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
