package com.campus.vuelosglobales.airport.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.airport.domain.entities.Airport;
import com.campus.vuelosglobales.airport.domain.repositories.AirportRepository;

@Service
public class AirportService {

    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }
    
    public List<Airport> findAll() {
        return airportRepository.findAll();
    }

    public Airport findById(Long id) {
        return airportRepository.findById(id).orElse(null);
    }

    public Airport save(Airport airport) {
        return airportRepository.save(airport);
    }

    public void deleteById(Long id) {
        airportRepository.deleteById(id);
    }

}
