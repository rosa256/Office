package com.myoffice.office.repositories;

import com.myoffice.office.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectsRepository extends JpaRepository<Project, Integer> {

    @Query("select p From Project p left outer join fetch p.taskList")
    List<Project> findAllProjects();
}
