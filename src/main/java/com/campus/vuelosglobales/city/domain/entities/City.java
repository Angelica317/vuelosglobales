package com.campus.vuelosglobales.city.domain.entities;


import com.campus.vuelosglobales.country.domain.entities.Country;

import java.util.List;

import com.campus.vuelosglobales.airport.domain.entities.Airport;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "airport_cities")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "id_country")
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<Airport> airports;

}

