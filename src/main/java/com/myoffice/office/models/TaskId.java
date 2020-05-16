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

    private Integer idPracownika;
    private Integer nrProjektu;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskId taskId = (TaskId) o;
        return idPracownika.equals(taskId.idPracownika) &&
                nrProjektu.equals(taskId.nrProjektu);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPracownika, nrProjektu);
    }
}
