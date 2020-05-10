package com.myoffice.office.services;

import com.myoffice.office.models.Project;
import com.myoffice.office.repositories.ProjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectsService {

    @Autowired
    private ProjectsRepository projectsRepository;

    public List<Project> getAllProjects(){
        return projectsRepository.findAll();
    }
}
