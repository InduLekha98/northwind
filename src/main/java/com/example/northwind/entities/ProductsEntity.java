package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Entity
@Table(name = "products")
@Data
public class ProductsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int productId;
    @NotNull
    @Column(nullable = false)
    public String productName;
    private int supplierId;
    public int categoryId;
    public String quantityPerUnit;
    public float unitPrice;
    private int unitInStock;
    private int unitsInOrder;
    public int recordLevel;
    @Column(nullable = false)
    public int discontinued;
}
