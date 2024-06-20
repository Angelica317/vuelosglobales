package com.campus.vuelosglobales.domain.entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "airport_flight_connections")
public class FlightConnection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String connection_number;

    @ManyToOne
    @JoinColumn(name = "idTrip")
    private Trip trip;

    @ManyToOne
    @JoinColumn(name = "idPlane")
    private Plane plane;

    @ManyToOne
    @JoinColumn(name = "idAirport")
    private Airport airport;

}
