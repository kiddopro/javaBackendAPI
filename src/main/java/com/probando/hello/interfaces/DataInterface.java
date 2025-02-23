package com.probando.hello.interfaces;

import java.util.List;

import com.probando.hello.models.Product;

public interface DataInterface {
    
    Product getProductById(int id);

    List<Product> getProducts();

    boolean addProduct(Product product);
    
    boolean deleteProduct(int id);
    
}
