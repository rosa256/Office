package com.myoffice.office.repositories;

import com.myoffice.office.models.Task;
import com.myoffice.office.models.TaskId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, TaskId> {

    List<Task> findAllByTaskIdIdPracownikaIn(List<Integer> employeesIds);
    List<Task> findAllByTaskIdNrProjektuIn(List<Integer> nrsProjects);
}
