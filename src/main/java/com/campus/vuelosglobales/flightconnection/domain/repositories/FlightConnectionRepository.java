package com.campus.vuelosglobales.flightconnection.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;

public interface FlightConnectionRepository {
    List<FlightConnection> findAll();
    Optional<FlightConnection> findById(Long id);
    FlightConnection save(FlightConnection flightConnection);
    void deleteById(Long id);
}

