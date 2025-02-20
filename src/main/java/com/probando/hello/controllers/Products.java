package com.probando.hello.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/products")
public class Products {

    @GetMapping("/{id}")
    public String getProductById(@PathVariable int id) {
        return "Product por ID: " + id;
    }

    @GetMapping("/")
    public String getProducts() {
        return "Home";
    }

}
