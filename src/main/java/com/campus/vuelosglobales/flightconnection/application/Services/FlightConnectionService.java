package com.campus.vuelosglobales.flightconnection.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.flightconnection.domain.entities.FlightConnection;
import com.campus.vuelosglobales.flightconnection.domain.repositories.FlightConnectionRepository;

@Service
public class FlightConnectionService {

    private final FlightConnectionRepository flightConnectionRepository;

    public FlightConnectionService(FlightConnectionRepository flightConnectionRepository) {
        this.flightConnectionRepository = flightConnectionRepository;
    }

    public List<FlightConnection> findAll() {
        return flightConnectionRepository.findAll();
    }

    public FlightConnection findById(Long id) {
        return flightConnectionRepository.findById(id).orElse(null);
    }

    public FlightConnection save(FlightConnection flightConnection) {
        return flightConnectionRepository.save(flightConnection);
    }

    public void deleteById(Long id) {
        flightConnectionRepository.deleteById(id);
    }
}
