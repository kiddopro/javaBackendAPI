package com.probando.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.probando.hello.data.Data;
import com.probando.hello.models.Product;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/products")
public class Products {

    Data data = new Data();

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return data.getProductById(id);
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return data.getProducts();
    }

}
