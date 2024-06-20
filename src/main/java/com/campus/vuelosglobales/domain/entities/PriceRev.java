package com.campus.vuelosglobales.domain.entities;

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
