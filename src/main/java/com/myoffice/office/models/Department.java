package com.myoffice.office.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
public class Department{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nrDepartamentu;
    private String nazwa;
    private String lokalizacja;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
    @JsonManagedReference
    private List<Employee> employees;
}
