package com.myoffice.office.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Task implements Serializable {
    @EmbeddedId
    private TaskId task_id;

    private Integer ilosc_godzin;
    private Double stawka_za_godzine;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pracownika")
    private Employee employee;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nr_projektu")
    private Project project;
}
