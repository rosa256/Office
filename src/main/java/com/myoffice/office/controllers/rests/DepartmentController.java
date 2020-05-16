package com.myoffice.office.controllers.rests;

import com.myoffice.office.dto.DepartmentDTO;
import com.myoffice.office.models.Department;
import com.myoffice.office.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<DepartmentDTO> getDepartments(){
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{page}")
    public List<DepartmentDTO> getDepartments(@PathVariable(name = "page") Integer page){
        return departmentService.getAllDepartmentsPage(page);
    }

    @GetMapping("/departments/employees/{page}")
    public List<DepartmentDTO> getDepartmentsWithEmployees(@PathVariable(name = "page", required = false) int page){
        return departmentService.getDepartmentsWithEmployees(page);
    }

    @GetMapping("/departments/employees")
    public String getAllDepartmentsWithEmployees(){
        return "Not Implemented";
    }
}