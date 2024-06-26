package com.campus.vuelosglobales.city.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.city.domain.entities.City;

@Repository
public interface CityPersistenceAdapter extends JpaRepository<City, Long>{
    
}
