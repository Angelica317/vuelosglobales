package com.campus.vuelosglobales.trip.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.trip.domain.entities.Trip;
import com.campus.vuelosglobales.trip.domain.repositories.TripRepository;

@Component
public class TripRepositoryImpl implements TripRepository {

    private final TripPersistenceAdapter tripPersistenceAdapter;

    public TripRepositoryImpl(TripPersistenceAdapter tripPersistenceAdapter) {
        this.tripPersistenceAdapter = tripPersistenceAdapter;
    }

    @Override
    public List<Trip> findAll() {
        return tripPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Trip> findById(Long id) {
        return tripPersistenceAdapter.findById(id);
    }

    @Override
    public Trip save(Trip trip) {
        return tripPersistenceAdapter.save(trip);
    }

    @Override
    public void deleteById(Long id) {
        tripPersistenceAdapter.deleteById(id);
    }
}
