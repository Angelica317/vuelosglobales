package com.campus.vuelosglobales.airline.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.airline.domain.entities.Airline;

@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long>{
    
} 
