package com.campus.vuelosglobales.flightfare.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;
import com.campus.vuelosglobales.flightfare.domain.repositories.FlightFareRepository;

@Service
public class FlightFareService {

    private final FlightFareRepository flightFareRepository;

    public FlightFareService(FlightFareRepository flightFareRepository) {
        this.flightFareRepository = flightFareRepository;
    }

    public List<FlightFare> findAll() {
        return flightFareRepository.findAll();
    }

    public FlightFare findById(Long id) {
        return flightFareRepository.findById(id).orElse(null);
    }

    public FlightFare save(FlightFare flightFare) {
        return flightFareRepository.save(flightFare);
    }

    public void deleteById(Long id) {
        flightFareRepository.deleteById(id);
    }
}
