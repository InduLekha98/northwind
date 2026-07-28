package com.example.northwind.controller;

import com.example.northwind.dto.EmployeeDto;
import com.example.northwind.entities.Employees;
import com.example.northwind.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor

public class EmployeeController {
    @Autowired
    private final EmployeeService employeeService;
    // DEPENDENCY INJECTION

    @GetMapping("/{id}")
    public Employees getEmployee(@PathVariable int id){
        return employeeService.getById(id);
    }
    @GetMapping
    public List<Employees> getEmployees(){
        //logic
        return employeeService.getAll();
    }
    @PostMapping
    public Employees createEmployee(@RequestBody Employees employee){
        return  employeeService.create(employee);
    }
    @PutMapping("/{id}")
    public Employees updateEmployee(@RequestBody Employees employee,@PathVariable int id){
        return employeeService.update(employee, id);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
         employeeService.delete(id);
    }
    @PatchMapping("/{id}")
    public Employees partialUpdate(@RequestBody EmployeeDto partialEmployee, @PathVariable int id){
        return employeeService.patchEmployee(partialEmployee, id);
    }



}
