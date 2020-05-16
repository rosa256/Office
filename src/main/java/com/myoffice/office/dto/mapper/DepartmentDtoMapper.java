package com.myoffice.office.dto.mapper;

import com.myoffice.office.dto.DepartmentDTO;
import com.myoffice.office.models.Department;

import java.util.List;
import java.util.stream.Collectors;

public class DepartmentDtoMapper {

    private DepartmentDtoMapper(){ } // To avoid instantiate this class.

    public static List<DepartmentDTO> mapToDepartmentDTOs(List<Department> allDepartments) {
        List<DepartmentDTO> departmentsDTOS = allDepartments.stream()
                .map(department -> mapToDepartmentDTO(department))
                .collect(Collectors.toList());
        return departmentsDTOS;
    }

    private static DepartmentDTO mapToDepartmentDTO(Department department) {
        DepartmentDTO departmentDTO = DepartmentDTO.builder()
                .nazwa(department.getNazwa())
                .lokalizacja(department.getLokalizacja())
                .nrDepartamentu(department.getNrDepartamentu())
                .build();
        return departmentDTO;
    }

}
