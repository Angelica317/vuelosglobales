package com.campus.vuelosglobales.plane.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.plane.domain.entities.Plane;

public interface PlaneRepository {
    List<Plane> findAll();
    Optional<Plane> findById(Long id);
    Plane save(Plane plane);
    void deleteById(Long id);
}
