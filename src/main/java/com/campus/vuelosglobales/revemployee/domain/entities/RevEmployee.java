package com.campus.vuelosglobales.revemployee.domain.entities;

import com.campus.vuelosglobales.employee.domain.entities.Employee;
import com.campus.vuelosglobales.revision.domain.entities.Revision;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "revemployees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RevEmployee {

    @EmbeddedId
    private RevEmployeePK id;

    @ManyToOne
    @MapsId("idEmployee")
    @JoinColumn(name = "id")
    private Employee employee;

    @ManyToOne
    @MapsId("idRevision")
    @JoinColumn(name = "id_rev")
    private Revision revision;
}

