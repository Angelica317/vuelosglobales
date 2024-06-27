package com.campus.vuelosglobales.trip.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.trip.domain.entities.Trip;

public interface TripRepository {
    List<Trip> findAll();
    Optional<Trip> findById(Long id);
    Trip save(Trip trip);
    void deleteById(Long id);
}
