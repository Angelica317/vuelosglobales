package com.campus.vuelosglobales.revisiondetail.domain.entities;

import com.campus.vuelosglobales.revision.domain.entities.Revision;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_revision_details")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RevisionDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "idRevision")
    private Revision revision;
}
