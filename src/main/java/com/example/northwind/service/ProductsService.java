package com.example.northwind.service;


import com.example.northwind.dto.ProductsDto;
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
        productRepository.deleteById(id);
    }

    public ProductsEntity update(ProductsEntity productsEntity, int id) {

        ProductsEntity product = productRepository.findAllById(id);

        //product.getProduct_name // mouse

        //productsEntity.getProduct_name // key_board

        product.setProductName(productsEntity.getProductName());
        product.setDiscontinued(productsEntity.isDiscontinued());
        product.setCategory(productsEntity.getCategory());
        product.setQuantityPerUnit(productsEntity.getQuantityPerUnit());
        product.setReorderLevel(productsEntity.getReorderLevel());
        product.setSupplier(productsEntity.getSupplier());
        product.setUnitsInStock(productsEntity.getUnitsInStock());
        product.setUnitPrice(productsEntity.getUnitPrice());
        product.setUnitsOnOrder(productsEntity.getUnitsOnOrder());

        return productRepository.save(product);
    }
    public ProductsEntity patchProducts(ProductsDto partialProduct, int id){
       ProductsEntity oldProduct = productRepository.findAllById(id);
       oldProduct.setProductName(partialProduct.getProductName());
       return productRepository.save(oldProduct);
    }



 }
