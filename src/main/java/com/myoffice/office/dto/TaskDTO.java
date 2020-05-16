package com.myoffice.office.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Builder
public class TaskDTO {
    @JsonIgnore
    private Integer idPracownika;
    private Integer nrProjektu;
    private Integer ilosc_godzin;
    private Double stawka_za_godzine;
    private Date data_rozpoczecia;
    private Date data_zakonczenia;

}
