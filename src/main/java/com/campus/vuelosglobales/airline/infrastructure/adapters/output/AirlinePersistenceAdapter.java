package com.campus.vuelosglobales.airline.infrastructure.adapters.output;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlinePersistenceAdapter extends JpaRepository<Airline, Long> {

}
