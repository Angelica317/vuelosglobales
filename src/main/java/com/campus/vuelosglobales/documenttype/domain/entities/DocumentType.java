package com.campus.vuelosglobales.documenttype.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "documenttypes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
