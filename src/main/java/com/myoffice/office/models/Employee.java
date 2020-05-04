package com.myoffice.office.models;

import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

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
    private Integer nr_dep;

    @Override
    public String toString() {
        return "Employee{" +
                "id_pracownika=" + id_pracownika +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", data_zatrudnienia=" + data_zatrudnienia +
                ", pensja=" + pensja +
                ", premia=" + premia +
                ", nr_departamentu=" + nr_dep +
                '}';
    }
}


