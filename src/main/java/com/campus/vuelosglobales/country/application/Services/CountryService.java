package com.campus.vuelosglobales.country.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.country.domain.entities.Country;
import com.campus.vuelosglobales.country.domain.repositories.CountryRepository;

@Service
public class CountryService {

    private final CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> findAll() {
        return countryRepository.findAll();
    }

    public Country findById(Long id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country save(Country country) {
        return countryRepository.save(country);
    }

    public void deleteById(Long id) {
        countryRepository.deleteById(id);
    }
}
