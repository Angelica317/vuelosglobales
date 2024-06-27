package com.campus.vuelosglobales.flightfare.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.flightfare.domain.entities.FlightFare;
import com.campus.vuelosglobales.flightfare.domain.repositories.FlightFareRepository;

@Component
public class FlightFareRepositoryImpl implements FlightFareRepository {

    private final FlightFarePersistenceAdapter flightFarePersistenceAdapter;

    public FlightFareRepositoryImpl(FlightFarePersistenceAdapter flightFarePersistenceAdapter) {
        this.flightFarePersistenceAdapter = flightFarePersistenceAdapter;
    }

    @Override
    public List<FlightFare> findAll() {
        return flightFarePersistenceAdapter.findAll();
    }

    @Override
    public Optional<FlightFare> findById(Long id) {
        return flightFarePersistenceAdapter.findById(id);
    }

    @Override
    public FlightFare save(FlightFare flightFare) {
        return flightFarePersistenceAdapter.save(flightFare);
    }

    @Override
    public void deleteById(Long id) {
        flightFarePersistenceAdapter.deleteById(id);
    }
}
