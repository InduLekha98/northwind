package com.example.northwind.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "suppliers")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Suppliers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    public int supplierId;

    @Column(nullable = false)
    public String companyName;

    public String contactName;

    public String contactTitle;

    public String address;

    public String city;

    public String region;

    public String postalCode;

    public String country;

    public String phone;

    public String fax;

    public  String homepage;

    @OneToMany(mappedBy = "supplier")
    private List<ProductsEntity> products;
}
