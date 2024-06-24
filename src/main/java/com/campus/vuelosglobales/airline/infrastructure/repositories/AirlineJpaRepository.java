package com.campus.vuelosglobales.airline.infrastructure.repositories;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirlineJpaRepository extends JpaRepository<Airline, Integer> {

}
