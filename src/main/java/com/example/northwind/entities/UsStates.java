package com.example.northwind.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "us_states")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class UsStates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "state_id", nullable = false)
    public int stateId;

    @Column(name = "state_name", length = 100)
    public String stateName;

    @Column(name = "state_abbr", length = 2)
    public String stateAbbr;

    @Column(name = "state_region", length = 50)
    public String stateRegion;
}
