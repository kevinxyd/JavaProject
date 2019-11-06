package com.pojo;

public class Book {
    private String ISBN;
    private double price;
    private String name;

    public Book() {
    }

    public Book( String ISBN, double price, String name) {
        this.ISBN = ISBN;
        this.price = price;
        this.name = name;
    }


    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
