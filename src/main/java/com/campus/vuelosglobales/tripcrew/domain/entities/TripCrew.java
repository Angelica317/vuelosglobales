package com.campus.vuelosglobales.tripcrew.domain.entities;

import com.campus.vuelosglobales.employee.domain.entities.Employee;
import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tripcrews")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripCrew {

    @EmbeddedId
    private TripCrewPK id;

    @ManyToOne
    @MapsId("idEmployee")
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @ManyToOne
    @MapsId("idConnection")
    @JoinColumn(name = "connection_id", referencedColumnName = "id")
    private FlightConnection flightConnection; 
}
