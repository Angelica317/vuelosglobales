package com.campus.vuelosglobales.airport.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.airport.domain.entities.Airport;

public interface AirportRepository {
    List<Airport> findAll();
    Optional<Airport> findById(long id);
    Airport save(Airport airport);
    void deleteById(long id);
}
