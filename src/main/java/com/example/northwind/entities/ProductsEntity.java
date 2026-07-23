package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Entity
@Table(name = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="product_id")
    private int id;
    @NotNull
    @Column(nullable = false)
    private String productName;
    private int supplierId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_Id")
    private Category category;
    private String quantityPerUnit;
    private float unitPrice;
    private int unitsInStock;
    private int unitsOnOrder;
    private int reorderLevel;
    @Column(nullable = false)
    private boolean discontinued = false;

    @OneToMany(mappedBy = "products")
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "products")
    private  List<Suppliers> suppliers;


}
