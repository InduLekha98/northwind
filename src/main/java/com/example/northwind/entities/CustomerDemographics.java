package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_demographics")

public class CustomerDemographics {
    @Id
    @Column(name = "customer_type_id", nullable = false)
    public int customerTypeId;

    @Lob
    @Column(name = "customer_desc")
    public String customerDesc;


}





