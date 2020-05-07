package com.myoffice.office.models;

import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Service
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_pracownika;
    private Integer id_kierownika;
    private String nazwisko;
    private String stanowisko;
    private Date data_zatrudnienia;
    private Float pensja;
    private Float premia;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nr_departamentu")
    private Department department;

    @OneToMany(mappedBy = "employee")
    private List<Task> taskList;

    @Override
    public String toString() {
        return "Employee{" +
                "id_pracownika=" + id_pracownika +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", data_zatrudnienia=" + data_zatrudnienia +
                ", pensja=" + pensja +
                ", premia=" + premia +
                '}';
    }
}


