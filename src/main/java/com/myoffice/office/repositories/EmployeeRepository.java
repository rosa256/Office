package com.myoffice.office.repositories;

import com.myoffice.office.models.Employee;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    List<Employee> findAllByDepartmentNrDepartamentuIn(List<Integer> ids);

    @Query("Select e From Employee e")
    List<Employee> findAllEmployees(Pageable page);
}
