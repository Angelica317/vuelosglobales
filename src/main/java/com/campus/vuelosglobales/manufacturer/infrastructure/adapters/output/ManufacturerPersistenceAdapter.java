package com.campus.vuelosglobales.manufacturer.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.manufacturer.domain.entities.Manufacturer;

@Repository
public interface ManufacturerPersistenceAdapter extends JpaRepository<Manufacturer, Long> {
}
