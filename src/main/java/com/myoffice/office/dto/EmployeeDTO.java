package com.myoffice.office.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.myoffice.office.models.Task;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Builder
public class EmployeeDTO {
    private Integer id_pracownika;
    private Integer id_kierownika;
    private String nazwisko;
    private String stanowisko;
    private Date data_zatrudnienia;
    private Float pensja;
    private Float premia;
    private Integer nr_departamentu;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TaskDTO> taskList;
}
