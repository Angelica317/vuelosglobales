package com.campus.vuelosglobales.domain.entities;

import java.util.Date;
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
    @JoinColumn(name = "idRol")
    private TripulantRole tripulantRole;

    @Column(name = "ingresDate")
    private Date ingresdate;

    @ManyToOne
    @JoinColumn(name = "idAirline")
    private Airline airline;

    @ManyToOne
    @JoinColumn(name = "idAirport")
    private Airport airport;
}

