package com.example.northwind.repositories;

import com.example.northwind.entities.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface EmployeeRepository extends CrudRepository<Employees, Integer> {

    Employees findById(int id);

    List<Employees> findAll();

    Employees save(Employees employee);

    void deleteById(int id);
}
