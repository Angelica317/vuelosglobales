package com.campus.vuelosglobales.flightfare.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;

public interface FlightFareRepository {
    List<FlightFare> findAll();
    Optional<FlightFare> findById(Long id);
    FlightFare save(FlightFare flightFare);
    void deleteById(Long id);
}
