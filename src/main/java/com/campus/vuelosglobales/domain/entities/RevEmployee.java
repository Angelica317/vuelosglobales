package com.campus.vuelosglobales.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_revemployee")
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
    @JoinColumn(name = "idemployee")
    private Employee employee;

    @ManyToOne
    @MapsId("idRevision")
    @JoinColumn(name = "idrevision")
    private Revision revision;
}

