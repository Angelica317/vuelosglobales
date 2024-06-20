package com.campus.vuelosglobales.country.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_countries")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
