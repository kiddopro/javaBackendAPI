package com.probando.hello.models;
import com.probando.hello.interfaces.ProductInterface;

public class Product implements ProductInterface{

    // variables
    private final int id;
    private String name;
    private String description;
    private double price;

    // constructor
    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // setters
    public void setProductDescription(String description) {
        this.description = description;
    }

    public void setProductName(String name) {
        this.name = name;
    }

    public void setProductPrice(double price) {
        this.price = price;
    }

    // getters
    public String getProductDescription() {
        return this.description;
    }

    public String getProductName() {
        return this.name;
    }

    public double getProductPrice() {
        return this.price;
    }

    public int getId() {
        return this.id;
    }

}
