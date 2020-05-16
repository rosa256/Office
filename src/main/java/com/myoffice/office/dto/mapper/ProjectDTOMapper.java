package com.myoffice.office.dto.mapper;

import com.myoffice.office.dto.ProjectDTO;
import com.myoffice.office.models.Project;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectDTOMapper {
    private ProjectDTOMapper(){}

    public static List<ProjectDTO> mapProjectsToDTOS(List<Project> projectList){
        return projectList.stream()
                .map(project -> mapProjectToDTO(project))
                .collect(Collectors.toList());
    }

    private static ProjectDTO mapProjectToDTO(Project project) {
        return ProjectDTO.builder()
                .nr_projektu(project.getNrProjektu())
                .nazwa(project.getNazwa())
                .budzet(project.getBudzet())
                .data_rozpoczecia(project.getData_rozpoczecia())
                .data_zakonczenia(project.getData_zakonczenia())
                .build();
    }
}
