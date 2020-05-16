package com.myoffice.office.services;

import com.myoffice.office.dto.DepartmentDTO;
import com.myoffice.office.dto.EmployeeDTO;
import com.myoffice.office.dto.mapper.DepartmentDtoMapper;
import com.myoffice.office.dto.mapper.EmployeeDTOMapper;
import com.myoffice.office.models.Department;
import com.myoffice.office.models.Employee;
import com.myoffice.office.repositories.DepartmentRepository;
import com.myoffice.office.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentService {
    private static final int PAGE_SIZE = 2;
    private DepartmentRepository departmentRepository;
    private EmployeeRepository employeeRepository;
    @Autowired
    public DepartmentService(DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    public List<DepartmentDTO> getAllDepartments(){
        List<Department> allDepartments = departmentRepository.findAllDepartments();
        return DepartmentDtoMapper.mapToDepartmentDTOs(allDepartments);
    }


    public List<DepartmentDTO> getAllDepartmentsPage(Integer page){
        List<Department> departmentsPage = departmentRepository.findAllDepartmentsPage(PageRequest.of(page, PAGE_SIZE, Sort.by(Sort.Direction.DESC, "id")));
        return DepartmentDtoMapper.mapToDepartmentDTOs(departmentsPage);
    }

    public List<DepartmentDTO> getDepartmentsWithEmployees(int page){
        List<Department> allDepartments = departmentRepository.findAllDepartmentsPage(PageRequest.of(page, PAGE_SIZE));
        List<Integer> departmentsIds = allDepartments.stream()
                .map(department -> department.getNrDepartamentu())
                .collect(Collectors.toList());

        List<DepartmentDTO> allDepartmentsDTO = DepartmentDtoMapper.mapToDepartmentDTOs(allDepartments);
        List<Employee> employees = employeeRepository.findAllByDepartmentNrDepartamentuIn(departmentsIds);
        List<EmployeeDTO> employeeDTOList = EmployeeDTOMapper.mapEmployeesToDTOs(employees);

        allDepartmentsDTO.forEach(department -> department.setEmployeeDTOList(extractEmployees(employeeDTOList, department.getNrDepartamentu())));
        return allDepartmentsDTO;
    }

    private List<EmployeeDTO> extractEmployees(List<EmployeeDTO> employeesDTOList, Integer nr_departamentu) {
        return employeesDTOList.stream()
                .filter(employee -> employee.getNr_departamentu() == nr_departamentu)
                .collect(Collectors.toList());
    }
}
