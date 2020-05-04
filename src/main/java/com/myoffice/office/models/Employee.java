package com.myoffice.office.models;

import java.util.Date;

public class Employee {
    private Integer id_pracownika;
    private String nazwisko;
    private String stanowisko;
    private Date data_zatrudnienia;
    private Float pensja;
    private Float premia;
    private Integer nr_departamentu;

    public Employee(Integer id_pracownika, String nazwisko, String stanowisko, Date data_zatrudnienia, Float pensja, Float premia, Integer nr_departamentu) {
        this.id_pracownika = id_pracownika;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.data_zatrudnienia = data_zatrudnienia;
        this.pensja = pensja;
        this.premia = premia;
        this.nr_departamentu = nr_departamentu;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id_pracownika=" + id_pracownika +
                ", nazwisko='" + nazwisko + '\'' +
                ", stanowisko='" + stanowisko + '\'' +
                ", data_zatrudnienia=" + data_zatrudnienia +
                ", pensja=" + pensja +
                ", premia=" + premia +
                ", nr_departamentu=" + nr_departamentu +
                '}';
    }
}


