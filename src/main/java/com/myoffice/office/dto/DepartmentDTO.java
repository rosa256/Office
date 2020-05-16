package com.myoffice.office.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class DepartmentDTO {
    private Integer nrDepartamentu;
    private String nazwa;
    private String lokalizacja;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<EmployeeDTO> employeeDTOList;
}
