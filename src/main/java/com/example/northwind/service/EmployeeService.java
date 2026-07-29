package com.example.northwind.service;

import com.example.northwind.dto.EmployeeDto;
import com.example.northwind.entities.Employees;
import com.example.northwind.repositories.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    @Autowired
    private final EmployeeRepository employeeRepository;
    public Employees getById(int id){
        return employeeRepository.findById(id);
    }public List<Employees> getAll(){
        // logic
        return  employeeRepository.findAll();
    }
    public Employees create(Employees employee){
        return  employeeRepository.save(employee);
    }
    public Employees update(Employees employee,int id){
        // logic
        //return
        //get the row
        Employees oldEmployee = employeeRepository.findById(id);
      // update
        oldEmployee.setFirstName(employee.getFirstName());
      // save
        return employeeRepository.save(oldEmployee);
    }
    public void delete(int id){
         employeeRepository.deleteById(id);
    }
     public Employees patchEmployee(EmployeeDto partialEmployee, int id){
        Employees oldEmployee = employeeRepository.findById(id);
        oldEmployee.setFirstName(partialEmployee.getFirstName());
        return employeeRepository.save(oldEmployee);
     }
}
