package com.example.northwind.controller;

import com.example.northwind.dto.ProductsDto;
import com.example.northwind.entities.ProductsEntity;
import com.example.northwind.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.northwind.entities.ProductsEntity;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductsService productsService;

    @GetMapping("/{id}")
    public ProductsEntity getProductById(@PathVariable int id) {

        //use product service to get product by id

        return productsService.getById(id);

    }

    @GetMapping
    public List<ProductsEntity> getProducts() {

        return productsService.getAll();

        //
    }
     //to post a new product in products table

    @PostMapping
    public ProductsEntity createProduct(@RequestBody ProductsEntity productsEntity){

        return productsService.create(productsEntity);
    }

    @DeleteMapping("/{id}")
    public void DeleteProduct(@PathVariable int id) {

        //use product service to get product by id

         productsService.delete(id);
    }

    @PutMapping("/{id}")
    public ProductsEntity updateProduct(@PathVariable int id, @RequestBody ProductsEntity productsEntity){

        return productsService.update(productsEntity, id);
    }
    @PatchMapping("/{id}")
    public ProductsEntity partialUpdate(@PathVariable int id, @RequestBody ProductsDto productsDto){
         return productsService.patchProducts(productsDto, id);
    }

}
//public  resopnse data type function name(){}