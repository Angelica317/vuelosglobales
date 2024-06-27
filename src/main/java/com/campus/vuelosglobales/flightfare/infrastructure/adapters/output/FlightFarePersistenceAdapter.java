package com.campus.vuelosglobales.flightfare.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;

@Repository
public interface FlightFarePersistenceAdapter extends JpaRepository<FlightFare, Long> {
}
