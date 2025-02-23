package com.probando.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import com.probando.hello.data.Data;
import com.probando.hello.models.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    Data data = new Data();

    @GetMapping("/{idProduct}")
    public Product getProductById(@PathVariable int idProduct) {
        return data.getProductById(idProduct);
    }

    @GetMapping("/")
    public List<Product> getProducts() {
        return data.getProducts();
    }

    @PostMapping("/add")
    public boolean postMethodName(@RequestBody String jsonBody) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Product product = objectMapper.readValue(jsonBody, Product.class);
            data.addProduct(product);
            // System.out.println(data.getProducts());
            return true;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return false;
        }
        
    }
}
