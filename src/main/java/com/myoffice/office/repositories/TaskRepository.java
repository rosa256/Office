package com.myoffice.office.repositories;

import com.myoffice.office.models.Employee;
import com.myoffice.office.models.Task;
import com.myoffice.office.models.TaskId;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, TaskId> {

    List<Employee> findAllBy();
}
