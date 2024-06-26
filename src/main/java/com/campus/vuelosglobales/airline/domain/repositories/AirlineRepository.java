package com.campus.vuelosglobales.airline.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.airline.domain.entities.Airline;

public interface AirlineRepository {
    List<Airline> findAll();
    Optional<Airline> findById(Long id);
    Airline save(Airline airline);
    void deleteById(Long id);
}
