package com.example.northwind.controller;

import com.example.northwind.entities.ProductsEntity;
import com.example.northwind.service.ProductsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor

public class ProductsController {

    public ProductsService productsService;

    @GetMapping("/{id}")
    public ProductsEntity getProductById(@PathVariable int id){

        //use product service to get product by id

        return productsService.getById(id);

    }


    @GetMapping
    public List<ProductsEntity> getProducts() {

        return productsService.getAll();

        //
    }


}
