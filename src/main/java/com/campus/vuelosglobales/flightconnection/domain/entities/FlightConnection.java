package com.campus.vuelosglobales.flightconnection.domain.entities;

import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.plane.domain.entities.Plane;
import com.campus.vuelosglobales.trip.domain.entities.Trip;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "flightconnections")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "connection_number", nullable = false)
    private String connectionNumber;

    @ManyToOne
    @JoinColumn(name = "id_trip", nullable = false)
    private Trip trip;

    @ManyToOne
    @JoinColumn(name = "id_plane", nullable = false)
    private Plane plane;

    @ManyToOne
    @JoinColumn(name = "id_airport", nullable = false)
    private Airport airport;
}
