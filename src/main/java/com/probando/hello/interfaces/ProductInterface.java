package com.probando.hello.interfaces;

public interface ProductInterface {

    // define methods of the product
    void setProductName(String name);

    void setProductDescription(String description);

    void setProductPrice(double price);

    String getProductName();

    String getProductDescription();

    double getProductPrice();

    int getId();

}
