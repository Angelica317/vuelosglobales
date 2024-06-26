package com.campus.vuelosglobales.country.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.country.domain.entities.Country;
import com.campus.vuelosglobales.country.domain.repositories.CountryRepository;

@Component
public class CountryRepositoryImpl implements CountryRepository {

    private final CountryPersistenceAdapter countryPersistenceAdapter;

    public CountryRepositoryImpl(CountryPersistenceAdapter countryPersistenceAdapter) {
        this.countryPersistenceAdapter = countryPersistenceAdapter;
    }

    @Override
    public List<Country> findAll() {
        return countryPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryPersistenceAdapter.findById(id);
    }

    @Override
    public Country save(Country country) {
        return countryPersistenceAdapter.save(country);
    }

    @Override
    public void deleteById(Long id) {
        countryPersistenceAdapter.deleteById(id);
    }
}
