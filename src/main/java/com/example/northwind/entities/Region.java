package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Table(name = "region")

public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", nullable = false)
    public int regionId;

    @Column(name = "region_description", nullable = false, length = 60)
    public String regionDescription;

    @OneToMany(mappedBy = "region", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private Set<Territories> territories;

}
