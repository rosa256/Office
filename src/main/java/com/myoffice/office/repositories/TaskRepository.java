package com.myoffice.office.repositories;

import com.myoffice.office.models.Task;
import com.myoffice.office.models.TaskId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, TaskId> {

    List<Task> findAllByTaskIdIdPracownikaIn(List<Integer> employeesIds);
    List<Task> findAllByTaskIdNrProjektuIn(List<Integer> nrsProjects);
}
