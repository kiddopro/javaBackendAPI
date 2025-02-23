package com.probando.hello.data;


import java.util.ArrayList;
import java.util.List;

import com.probando.hello.interfaces.DataInterface;
import com.probando.hello.models.Product;

public class Data implements DataInterface {

    // variable
    List<Product> products = new ArrayList<>();

    
    // constructor
    public Data() {
        products.add(new Product(1, "Product 1", "Description 1", 10.0));
        products.add(new Product(2, "Product 2", "Description 2", 20.0));
        products.add(new Product(3, "Product 3", "Description 3", 30.0));
    }

    // get product by id

    /**
     * 
     * @param id - id of the product
     * @return - null in case the product is not found
     */
    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    // get all products
    public List<Product> getProducts() {
        return products;
    }

    // add product
    public boolean addProduct(Product product) {
        try {
            products.add(product);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // delete product by id 
    public boolean deleteProduct(int id) {
        return products.removeIf(product -> product.getId() == id);
    }


}
