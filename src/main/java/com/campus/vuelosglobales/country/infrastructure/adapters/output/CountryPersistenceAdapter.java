package com.campus.vuelosglobales.country.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.country.domain.entities.Country;

@Repository
public interface CountryPersistenceAdapter extends JpaRepository<Country, Long> {
}
