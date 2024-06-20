package com.campus.vuelosglobales.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_airlines")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Airline {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
