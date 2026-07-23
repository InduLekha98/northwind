package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "territories")

public class Territories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "territory_id", nullable = false, length = 20)
    public  String territory_Id;

    @Column(name = "territory_description", nullable = false, length = 60 )
    public String territoryDescription;

    @ManyToOne
    @JoinColumn(name = "region_id", nullable = false)
    private Region region;

    @ManyToMany(mappedBy = "territories")
    private Set<Employees> employees;

}

