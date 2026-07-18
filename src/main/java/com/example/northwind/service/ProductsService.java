package com.example.northwind.service;


import com.example.northwind.entities.ProductsEntity;
import com.example.northwind.repositories.ProductRepository;

import java.util.List;

public class ProductsService {

    public ProductRepository productRepository;

    public ProductsEntity getById(int id){

        return productRepository.findAllById(id);

    }

    public List<ProductsEntity> getAll(){

        return  productRepository.findAll();

    }

//    function  syntax
//    public return type funcitonname (inout arguments ){}
 }
