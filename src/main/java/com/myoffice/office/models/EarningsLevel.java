package com.myoffice.office.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class EarningsLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nr_przedzialu;
    private Double gorna_granica;
    private Double dolna_granica;
}
