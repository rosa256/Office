package com.myoffice.office.repositories;

import com.myoffice.office.models.Department;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

    //@Query("Select d From Department d left join fetch d.employees")    //Problem z pobraniem wszystkiego do pamieci.
    @Query("Select d From Department d")
    List<Department> findAllDepartments();

    @Query("Select d From Department d")
    List<Department> findAllDepartmentsPage(Pageable page);
}
