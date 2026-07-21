package com.example.northwind.repositories;

import com.example.northwind.entities.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.parameters.P;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<ProductsEntity, Integer> {
    ProductsEntity findAllById(int id);
    List<ProductsEntity> findAll();
    ProductsEntity save(ProductsEntity productsEntity);

    void DeleteById(int id);

}



//

//- `GET /products` -- findALl() -- select * from products
//        - `GET /products/{id}` - curentyl you are doing this -- findAllbyId()
//        - `POST /products`  - saveALlAndFlush
//        - `PUT /products/{id}`  -- saveAndFlush
//        - `DELETE /products/{id}` -- deleteAllByIdInBatch

// interfaces -> contract there is no logic