package com.eight.two.pojo;

public class Product {
    private String id;
    private String pruductName;
    private float price;
    private String unit;
    private int count;

    public Product() {
    }

    public Product(String id, String pruductName, float price, String unit) {
        this.id = id;
        this.pruductName = pruductName;
        this.price = price;
        this.unit = unit;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPruductName() {
        return pruductName;
    }

    public void setPruductName(String pruductName) {
        this.pruductName = pruductName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
