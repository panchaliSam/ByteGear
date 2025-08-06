package com.eureka.order_service.controller;

import com.eureka.order_service.feign.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private ProductClient productClient;

    @GetMapping("/products")
    public List<String> getProductsFromProductService() {
        return productClient.getAllProducts();
    }
}