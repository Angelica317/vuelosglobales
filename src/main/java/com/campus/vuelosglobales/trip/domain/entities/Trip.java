package com.campus.vuelosglobales.trip.domain.entities;

import java.util.Date;

import com.campus.vuelosglobales.employee.domain.entities.Employee;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_trips")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date trip_date;

    @Column(name = "priceTrip")
    private Double price_trip;

    @ManyToOne
    @JoinColumn(name = "idEmployee")
    private Employee employee;
}
