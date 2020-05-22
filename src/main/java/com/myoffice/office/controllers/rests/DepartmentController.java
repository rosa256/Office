package com.myoffice.office.controllers.rests;

import com.myoffice.office.dto.DepartmentDTO;
import com.myoffice.office.models.Department;
import com.myoffice.office.services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<DepartmentDTO> getAllDepartmentsWithEmployees(){
        return departmentService.getAllDepartmentsWithEmployees();
    }


    @PostMapping(value = "/add/department")
    public Department addDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }

    @PutMapping("/edit/department")
    public Department editDepartment(@RequestBody Department department){
        return departmentService.editDepartment(department);
    }

    @DeleteMapping("/delete/department/{id}")
    public void deleteDepartment(@PathVariable(name = "id") Integer id){
        departmentService.removeDepartmentById(id);
    }
}