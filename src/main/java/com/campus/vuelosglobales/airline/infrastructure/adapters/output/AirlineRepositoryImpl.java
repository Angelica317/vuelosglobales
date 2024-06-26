package com.campus.vuelosglobales.airline.infrastructure.adapters.output;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import com.campus.vuelosglobales.airline.domain.repositories.AirlineRepository;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AirlineRepositoryImpl implements AirlineRepository {

    private final AirlinePersistenceAdapter airlinePersistenceAdapter;

    public AirlineRepositoryImpl(AirlinePersistenceAdapter airlinePersistenceAdapter) {
        this.airlinePersistenceAdapter = airlinePersistenceAdapter;
    }

    @Override
    public List<Airline> findAll() {
        return airlinePersistenceAdapter.findAll();
    }

    @Override
    public Optional<Airline> findById(Long id) {
        return airlinePersistenceAdapter.findById(id);
    }

    @Override
    public Airline save(Airline airline) {
        return airlinePersistenceAdapter.save(airline);
    }

    @Override
    public void deleteById(Long id) {
        airlinePersistenceAdapter.deleteById(id);
    }
}
