package com.myoffice.office.controllers.rests;

import com.myoffice.office.models.Project;
import com.myoffice.office.services.ProjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectsController {

    @Autowired
    private ProjectsService projectsService;

    @GetMapping("/projects")
    public List<Project> getProjects(){
        return projectsService.getAllProjects();
    }
}
