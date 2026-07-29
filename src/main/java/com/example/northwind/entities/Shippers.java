package com.example.northwind.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.* ;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shippers")

public class Shippers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipper_id", nullable = false)
    private int shipperId;

    @Column(name = "company_name", nullable = false, length = 40)
    private String companyName;

    @Column(name = "phone", length = 24)
    private String phone;

    @OneToMany(mappedBy = "shipper")
    private List<OrderEntity> orders;
}
