package com.probando.hello.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probando.hello.interfaces.ProductInterface;

public class Product implements ProductInterface{

    // variables
    
    @JsonProperty("id")
    private int id;
    @JsonProperty("name")
    private String productName;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("price")
    private double productPrice;

    // default constructor
    public Product() {}

    // constructor
    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.productName = name;
        this.productDescription = description;
        this.productPrice = price;
    }

    // setters

    @Override
    public void setProductDescription(String description) {
        this.productDescription = description;
    }

    @Override
    public void setProductName(String name) {
        this.productName = name;
    }

    @Override
    public void setProductPrice(double price) {
        this.productPrice = price;
    }

    // getters

    @Override
    public String getProductDescription() {
        return this.productDescription;
    }

    @Override
    public String getProductName() {
        return this.productName;
    }

    @Override
    public double getProductPrice() {
        return this.productPrice;
    }

    @Override
    public int getId() {
        return this.id;
    }

}
