package checkpoint3.com.dfbz.bean;

public class Good {

    private String id;
    private String name;
    private String unit;
    private Double price;

    public Good(){

    }

    public Good(String id, String name, String unit, Double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return id + "    " + name + "    " + price + "    " + unit;
    }
}
