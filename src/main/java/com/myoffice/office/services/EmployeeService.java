package com.myoffice.office.services;

import com.myoffice.office.models.Employee;
import com.myoffice.office.repositories.EmployeeRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }

    public Employee getEmployee(Integer id){
        return employeeRepository.findById(id).get();
    }
}
