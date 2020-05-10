package com.myoffice.office.models;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
public class TaskId implements Serializable {

    private Integer id_pracownika;
    private Integer nr_projektu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskId taskId = (TaskId) o;
        return id_pracownika.equals(taskId.id_pracownika) &&
                nr_projektu.equals(taskId.nr_projektu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_pracownika, nr_projektu);
    }
}
