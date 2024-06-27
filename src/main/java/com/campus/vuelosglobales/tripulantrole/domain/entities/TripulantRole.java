package com.campus.vuelosglobales.tripulantrole.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tripulantroles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripulantRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
