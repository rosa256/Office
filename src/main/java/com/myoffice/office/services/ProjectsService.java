package com.myoffice.office.services;

import com.myoffice.office.dto.ProjectDTO;
import com.myoffice.office.dto.TaskDTO;
import com.myoffice.office.dto.mapper.ProjectDTOMapper;
import com.myoffice.office.dto.mapper.TaskDTOMapper;
import com.myoffice.office.models.Project;
import com.myoffice.office.models.Task;
import com.myoffice.office.repositories.ProjectsRepository;
import com.myoffice.office.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectsService {

    private static final int PAGE_SIZE = 2;
    private ProjectsRepository projectsRepository;
    private TaskRepository taskRepository;

    @Autowired
    public ProjectsService(ProjectsRepository projectsRepository, TaskRepository taskRepository) {
        this.projectsRepository = projectsRepository;
        this.taskRepository = taskRepository;
    }

    public List<ProjectDTO> getAllProjects(){
        List<Project> projectList = projectsRepository.findAll();
        List<ProjectDTO> projectDTOList = ProjectDTOMapper.mapProjectsToDTOS(projectList);
        return projectDTOList;
    }

    public List<ProjectDTO> getProjectsWithTasks() {
        List<ProjectDTO> allProjectsDTOs = ProjectDTOMapper.mapProjectsToDTOS(projectsRepository.findAll());

        List<Integer> allProjectsIDs = allProjectsDTOs.stream()
                .map(project -> project.getNr_projektu())
                .collect(Collectors.toList());

        List<Task> allTasksList = taskRepository.findAll();
        List<TaskDTO> allTasksDTOList = TaskDTOMapper.mapTasksToDTOs(allTasksList);

        allProjectsDTOs.forEach(project -> project.setTaskList(extractTasksById(allTasksDTOList, project.getNr_projektu())));
        return allProjectsDTOs;
    }

    private List<TaskDTO> extractTasksById(List<TaskDTO> allTaskList, Integer nr_projektu) {
        return allTaskList.stream()
                .filter(taskDTO -> taskDTO.getNrProjektu() == nr_projektu)
                .collect(Collectors.toList());
    }

    public List<ProjectDTO> getProjectsWithTasksPage(Integer page) {
        List<Project> projectList = projectsRepository.findAllProjects(PageRequest.of(page, PAGE_SIZE));
        List<Integer> ids = projectList.stream()
                .map(project -> project.getNrProjektu())
                .collect(Collectors.toList());

        List<ProjectDTO> projectsDTOList = ProjectDTOMapper.mapProjectsToDTOS(projectList);

        List<Task> taskList = taskRepository.findAllByTaskIdNrProjektuIn(ids);
        List<TaskDTO> taskDTOList = TaskDTOMapper.mapTasksToDTOs(taskList);

        projectsDTOList.forEach(projectDTO -> projectDTO.setTaskList(extractTasksById(taskDTOList, projectDTO.getNr_projektu())));

        return projectsDTOList;
    }
}
