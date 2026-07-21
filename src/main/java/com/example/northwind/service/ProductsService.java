package com.example.northwind.service;


import com.example.northwind.entities.ProductsEntity;
import com.example.northwind.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.util.ReflectionUtils;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    @Autowired
    private final ProductRepository productRepository;

    public ProductsEntity getById(int id){

        return productRepository.findAllById(id);

    }

    public List<ProductsEntity> getAll(){

        return  productRepository.findAll();

    }

    public ProductsEntity create(ProductsEntity productsEntity) {

        return productRepository.save(productsEntity);

    }
    public void delete(int id){
        productRepository.DeleteById(id);
    }

    public ProductsEntity update(ProductsEntity productsEntity, int id) {

        ProductsEntity product = productRepository.findAllById(id);

        //product.getProduct_name // mouse

        //productsEntity.getProduct_name // key_board

        product.setProductName(productsEntity.getProductName());
        product.setDiscontinued(productsEntity.getDiscontinued());
        product.setCategoryId(productsEntity.getCategoryId());
        product.setQuantityPerUnit(productsEntity.getQuantityPerUnit());
        product.setRecordLevel(productsEntity.getRecordLevel());
        product.setSupplierId(productsEntity.getSupplierId());
        product.setUnitInStock(productsEntity.getUnitInStock());
        product.setUnitPrice(productsEntity.getUnitPrice());
        product.setUnitsInOrder(productsEntity.getUnitsInOrder());

        return productRepository.save(product);


    }


 }
