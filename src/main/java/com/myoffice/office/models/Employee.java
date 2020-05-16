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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idPracownika;
    private Integer idKierownika;
    private String nazwisko;
    private String stanowisko;
    private Date data_zatrudnienia;
    private Float pensja;
    private Float premia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nrDepartamentu")
    @JsonBackReference
    private Department department;

    @OneToMany(mappedBy = "employee")
    @JsonManagedReference
    private List<Task> taskList;
}


