package com.myoffice.office.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nr_departamentu;
    private String nazwa;
    private String lokalizacja;

    @OneToMany
    @JoinColumn(name = "nr_dep")
    private List<Employee> employees;
}
