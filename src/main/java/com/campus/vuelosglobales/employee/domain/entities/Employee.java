package com.campus.vuelosglobales.employee.domain.entities;

import java.util.Date;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.tripulatrole.domain.entities.TripulantRole;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_rol")
    private TripulantRole tripulantRole;

    @Column(name = "ingresDate")
    private Date ingresdate;

    @ManyToOne
    @JoinColumn(name = "id_airline")
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "id_airport")
    private Airport airport;
}

