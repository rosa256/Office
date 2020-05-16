package com.myoffice.office.dto;

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
public class ProjectDTO {
    private Integer nr_projektu;
    private String nazwa;
    private Double budzet;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<TaskDTO> taskList;
}
