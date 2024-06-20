package com.campus.vuelosglobales.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_flightfares")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightFare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "description")
    private String description;

    @Column(name = "datails")
    private String details;

    @Column(name = "value")
    private Long value;
}
