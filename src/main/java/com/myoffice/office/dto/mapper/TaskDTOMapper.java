package com.myoffice.office.dto.mapper;

import com.myoffice.office.dto.TaskDTO;
import com.myoffice.office.models.Task;

import java.util.List;
import java.util.stream.Collectors;

public class TaskDTOMapper {
    private TaskDTOMapper(){}

    public static List<TaskDTO> mapTasksToDTOs(List<Task> taskList){
        return taskList.stream()
                .map(task -> mapTaskToDTO(task))
                .collect(Collectors.toList());
    }

    private static TaskDTO mapTaskToDTO(Task task) {
        return TaskDTO.builder()
                .idPracownika(task.getTaskId().getIdPracownika())
                .nrProjektu(task.getTaskId().getNrProjektu())
                .data_rozpoczecia(task.getData_rozpoczecia())
                .data_zakonczenia(task.getData_zakonczenia())
                .ilosc_godzin(task.getIlosc_godzin())
                .stawka_za_godzine(task.getStawka_za_godzine())
                .build();
    }
}
