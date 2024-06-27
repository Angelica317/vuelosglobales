package com.campus.vuelosglobales.flightconnection.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;

@Repository
public interface FlightConnectionPersistenceAdapter extends JpaRepository<FlightConnection, Long> {
}
