package com.campus.vuelosglobales.city.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.city.domain.entities.City;

public interface CityRepository {
    List<City> findAll();
    Optional<City> findById(Long id);
    City save(City city);
    void deleteById(Long id);
}
