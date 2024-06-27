package com.campus.vuelosglobales.manufacturer.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.manufacturer.domain.entities.Manufacturer;

public interface ManufacturerRepository {
    List<Manufacturer> findAll();
    Optional<Manufacturer> findById(Long id);
    Manufacturer save(Manufacturer manufacturer);
    void deleteById(Long id);                             
}
