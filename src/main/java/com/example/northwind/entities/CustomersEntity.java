package com.example.northwind.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "customer_id", nullable = false, length = 5)
    public Long id;

    @Column(name = "company_name", nullable = false, length = 40)
    public String companyName;

    @Column(name = "contact_name", length = 30)
    public String contactName;

    @Column(name = "contact_title", length = 30)
    public String contactTitle;

    @Column(name = "address", length = 60)
    public String address;

    @Column(name = "city", length = 15)
    public String city;

    @Column(name = "region", length = 15)
    public String region;

    @Column(name = "postal_code", length = 10)
    public int postalCode;

    @Column(name = "country", length = 15)
    public String country;

    @Column(name = "phone", length = 24)
    public String phone;

    @Column(name = "fax", length = 24)
    public String fax;

    @OneToMany(mappedBy = "customer")
    private List<OrderEntity> orders;

    @OneToMany(mappedBy = "customer")
    private  List<CustomerCustomerDemo> customerCustomerDemos;

    @OneToMany(mappedBy = "customerDemographic")
    private List<CustomerDemographics> demographics;
}