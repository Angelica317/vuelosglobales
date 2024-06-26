package com.campus.vuelosglobales.country.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.country.domain.entities.Country;

public interface CountryRepository {
    List<Country> findAll();
    Optional<Country> findById(Long id);
    Country save(Country country);
    void deleteById(Long id);
}
