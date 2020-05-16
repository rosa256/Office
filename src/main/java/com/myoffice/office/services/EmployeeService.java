package com.myoffice.office.services;

import com.myoffice.office.dto.EmployeeDTO;
import com.myoffice.office.dto.TaskDTO;
import com.myoffice.office.dto.mapper.EmployeeDTOMapper;
import com.myoffice.office.dto.mapper.TaskDTOMapper;
import com.myoffice.office.models.Employee;
import com.myoffice.office.models.Task;
import com.myoffice.office.repositories.EmployeeRepository;
import com.myoffice.office.repositories.TaskRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Service
public class EmployeeService {

    private static final int PAGE_SIZE = 2;
    private EmployeeRepository employeeRepository;
    private TaskRepository taskRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository, TaskRepository taskRepository) {
        this.employeeRepository = employeeRepository;
        this.taskRepository = taskRepository;
    }

    public List<EmployeeDTO> getAllEmployees(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = EmployeeDTOMapper.mapEmployeesToDTOs(employeeList);
        return employeeDTOList;
    }

    public List<EmployeeDTO> getAllEmployeesWithTasks(){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = EmployeeDTOMapper.mapEmployeesToDTOs(employeeList);

        List<Task> allTasksList = taskRepository.findAll();
        List<TaskDTO> allTasksDTOs = TaskDTOMapper.mapTasksToDTOs(allTasksList);

        employeeDTOList.forEach(employeeDTO -> employeeDTO.setTaskList(extractTasksById(allTasksDTOs, employeeDTO.getId_pracownika())));
        return employeeDTOList;
    }


    public List<EmployeeDTO> getEmployeesWithTasks(Integer page){
        List<Employee> employeeList = (List<Employee>) employeeRepository.findAllEmployees(PageRequest.of(page, PAGE_SIZE));
        List<Integer> employeeIds = employeeList.stream()
                .map(employee -> employee.getIdPracownika())
                .collect(Collectors.toList());
        List<EmployeeDTO> employeeDTOList = EmployeeDTOMapper.mapEmployeesToDTOs(employeeList);

        List<Task> allTasksById = taskRepository.findAllByTaskIdIdPracownikaIn(employeeIds);
        List<TaskDTO> allTasksDTOs = TaskDTOMapper.mapTasksToDTOs(allTasksById);

        employeeDTOList.forEach(employeeDTO -> employeeDTO.setTaskList(extractTasksById(allTasksDTOs, employeeDTO.getId_pracownika())));
        return employeeDTOList;
    }

    private List<TaskDTO> extractTasksById(List<TaskDTO> allTasks, Integer id_pracownika) {
        return allTasks.stream()
                .filter(taskDTO -> taskDTO.getIdPracownika() == id_pracownika)
                .collect(Collectors.toList());

    }

    public Employee getEmployee(Integer id){
        return employeeRepository.findById(id).get();
    }
}
