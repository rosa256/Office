package com.myoffice.office.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nr_projektu;

    private String nazwa;
    private Double budzet;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

    @OneToMany(mappedBy = "project")
    private List<Task> taskList;
}
