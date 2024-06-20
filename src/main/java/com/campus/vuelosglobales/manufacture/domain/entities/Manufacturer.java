package com.campus.vuelosglobales.manufacture.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_manufacturers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
}
