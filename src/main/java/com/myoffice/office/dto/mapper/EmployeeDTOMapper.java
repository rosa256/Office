package com.myoffice.office.dto.mapper;

import com.myoffice.office.dto.EmployeeDTO;
import com.myoffice.office.models.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDTOMapper {

    private EmployeeDTOMapper(){}

    public static List<EmployeeDTO> mapEmployeesToDTOs(List<Employee> employeeList){
        List<EmployeeDTO> employeeDTOList = employeeList.stream()
                .map(employee -> mapEmployeeToDTO(employee))
                .collect(Collectors.toList());
        return employeeDTOList;
    }

    private static EmployeeDTO mapEmployeeToDTO(Employee employee) {
        EmployeeDTO employeeDTO = EmployeeDTO.builder()
                .id_pracownika(employee.getIdPracownika())
                .id_kierownika(employee.getIdKierownika())
                .data_zatrudnienia(employee.getData_zatrudnienia())
                .nazwisko(employee.getNazwisko())
                .pensja(employee.getPensja())
                .premia(employee.getPremia())
                .stanowisko(employee.getStanowisko())
                .nr_departamentu(employee.getDepartment().getNrDepartamentu())
                .build();
        return employeeDTO;
    }
}
