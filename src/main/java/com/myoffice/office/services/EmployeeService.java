package com.myoffice.office.services;

import com.myoffice.office.models.Employee;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Service
public class EmployeeService {
    private List<Employee> employeesList;

    public EmployeeService() {
        this.employeesList = new ArrayList<>();
        employeesList.add(new Employee(1,"Nazwisko1","SPRZEDAWCA", new Date(),300f,1000f,1));
    }
}
