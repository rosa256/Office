package com.myoffice.office.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Project implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nr_projektu;

    private String nazwa;
    private Double budzet;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

    @OneToMany(mappedBy = "project")
    @JsonManagedReference
    private List<Task> taskList;

    @Override
    public String toString() {
        return "Project{" +
                "nr_projektu=" + nr_projektu +
                ", nazwa='" + nazwa + '\'' +
                ", budzet=" + budzet +
                ", data_rozpoczecia=" + data_rozpoczecia +
                ", data_zakonczenia=" + data_zakonczenia +
                ", taskList=" + taskList +
                '}';
    }
}
