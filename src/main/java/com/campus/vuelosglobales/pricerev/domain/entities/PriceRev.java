package com.campus.vuelosglobales.pricerev.domain.entities;

import com.campus.vuelosglobales.employee.domain.entities.Employee;
import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_pricerevs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PriceRev {

    @EmbeddedId
    private PriceRevPK id;

    @ManyToOne
    @MapsId("idEmployee")
    @JoinColumn(name = "idEmployee")
    private Employee employee;

    @ManyToOne
    @MapsId("idConnection")
    @JoinColumn(name = "idConnection")
    private FlightConnection flightConnection; 
}
