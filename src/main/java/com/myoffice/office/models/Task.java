package com.myoffice.office.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Task implements Serializable {
    @EmbeddedId
    private TaskId taskId;
    private Integer ilosc_godzin;
    private Double stawka_za_godzine;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pracownika")
    @JsonBackReference
    @MapsId("id_pracownika") // Needed for EmbededId
    private Employee employee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nr_projektu")
    @JsonBackReference
    @MapsId("nr_projektu") // Needed for EmbededId
    private Project project;
}
