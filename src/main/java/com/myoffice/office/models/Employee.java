package com.myoffice.office.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Employee{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPracownika;
    private Integer idKierownika;
    private String nazwisko;
    private String stanowisko;
    private Date data_zatrudnienia;
    private Float pensja;
    private Float premia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nrDepartamentu", updatable = false, insertable = false)
    @JsonBackReference(value = "b_name")
    private Department department;

    @OneToMany(mappedBy = "employee")
    @JsonManagedReference(value = "a_name")
    private List<Task> taskList;
}


