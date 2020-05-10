package com.myoffice.office.services;

import com.myoffice.office.models.Employee;
import com.myoffice.office.models.Task;
import com.myoffice.office.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks(){
//        Employee e = new Employee();
        return taskRepository.findAll();
    }
}
