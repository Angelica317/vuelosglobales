package com.campus.vuelosglobales.city.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.city.domain.entities.City;
import com.campus.vuelosglobales.city.domain.repositories.CityRepository;

@Service
public class CityService {

    private final CityRepository cityRepository;

    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> findAll () {
        return cityRepository.findAll();
    }

    public City findById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    public City save(City city) {
        return cityRepository.save(city);
    }

    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }
        
}
