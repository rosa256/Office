package com.myoffice.office.controllers;

import com.myoffice.office.models.Employee;
import com.myoffice.office.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/")
    public String hello(){
        return "Hello, it works";
    }

    @GetMapping("/employees")
    public String getEmployee(){
        StringBuilder employees = new StringBuilder();
        for (Employee e: employeeService.getEmployeesList())
            employees.append(e.toString()).append(" <br>");
        return employees.toString();
    }
}
