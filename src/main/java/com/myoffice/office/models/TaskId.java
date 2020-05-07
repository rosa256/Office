package com.myoffice.office.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class TaskId implements Serializable {
    private Integer id_pracownika;
    private Integer nr_projektu;
}
