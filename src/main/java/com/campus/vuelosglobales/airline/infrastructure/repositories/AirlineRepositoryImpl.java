package com.campus.vuelosglobales.airline.infrastructure.repositories;

import com.campus.vuelosglobales.airline.domain.entities.Airline;
import com.campus.vuelosglobales.airline.domain.repositories.AirlineRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class AirlineRepositoryImpl implements AirlineRepository {

    private final AirlineJpaRepository airlineJpaRepository;

    public AirlineRepositoryImpl(AirlineJpaRepository airlineJpaRepository) {
        this.airlineJpaRepository = airlineJpaRepository;
    }

    @Override
    public List<Airline> findAll() {
        return airlineJpaRepository.findAll();
    }

    @Override
    public Optional<Airline> findById(Integer id) {
        return airlineJpaRepository.findById(id);
    }

    @Override
    public Airline save(Airline airline) {
        return airlineJpaRepository.save(airline);
    }

    @Override
    public void deleteById(Integer id) {
        airlineJpaRepository.deleteById(id);
    }
}
