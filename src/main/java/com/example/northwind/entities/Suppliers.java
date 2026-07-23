package com.example.northwind.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "suppliers")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Suppliers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false)
    public String supplierId;

    @Column(nullable = false)
    public String companyName;

    public String contactName;

    public String contactTitle;

    public String address;

    public String city;

    public String region;

    public  int postalCode;

    public String country;

    public String phone;

    public String fax;

    public  String homepage;
}
