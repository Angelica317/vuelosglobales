package com.campus.vuelosglobales.airline.application.services;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import com.campus.vuelosglobales.airline.domain.repositories.AirlineRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {

    private final AirlineRepository airlineRepository;

    public AirlineService(AirlineRepository airlineRepository) {
        this.airlineRepository = airlineRepository;
    }

    public List<Airline> findAll() {
        return airlineRepository.findAll();
    }
 
    public Airline findById(Integer id) {
        return airlineRepository.findById(id).orElse(null);
    }

    public Airline save(Airline airline) {
        return airlineRepository.save(airline);
    }

    public void deleteById(Integer id) {
        airlineRepository.deleteById(id);
    }
}
