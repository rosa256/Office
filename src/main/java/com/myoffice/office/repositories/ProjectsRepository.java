package com.myoffice.office.repositories;

import com.myoffice.office.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import org.springframework.data.domain.Pageable;

import java.util.List;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Integer> {

    @Query("select p From Project p left outer join fetch p.taskList")
    List<Project> findAllProjects();
    @Query("select p From Project p left outer join fetch p.taskList")
    List<Project> findAllProjects(Pageable page);

    //List<Project> findAllByNrProjektuIn(List<Integer> projectsIds);

}
