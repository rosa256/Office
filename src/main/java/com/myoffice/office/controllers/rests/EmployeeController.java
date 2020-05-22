package com.myoffice.office.controllers.rests;

import com.myoffice.office.dto.EmployeeDTO;
import com.myoffice.office.models.Employee;
import com.myoffice.office.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

//    @GetMapping("/")
//    public String hello(){
//        return "<b>Hello, it works</b>";
//    }

    @GetMapping("/employees")
    public List<EmployeeDTO> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id){
        return employeeService.getEmployee(id);
    }

    @GetMapping("employees/tasks")
    public List<EmployeeDTO> getEmployeesWithTask(){
        return employeeService.getAllEmployeesWithTasks();
    }

    @GetMapping("employees/tasks/{page}")
    public List<EmployeeDTO> getEmployeesWithTask(@PathVariable(name = "page") Integer page){
        return employeeService.getEmployeesWithTasks(page);
    }
}
