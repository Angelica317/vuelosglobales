package com.campus.vuelosglobales.gate.domain.entities;

import com.campus.vuelosglobales.airport.domain.entities.Airport;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "gates")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Gate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "gatenumber")
    private String gateNumber;

    @ManyToOne
    @JoinColumn(name = "airport_id", referencedColumnName = "id")
    private Airport airport;
}
