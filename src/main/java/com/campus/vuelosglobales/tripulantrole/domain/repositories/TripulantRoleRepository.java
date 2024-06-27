package com.campus.vuelosglobales.tripulantrole.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.tripulantrole.domain.entities.TripulantRole;

public interface TripulantRoleRepository {
    List<TripulantRole> findAll();
    Optional<TripulantRole> findById(Long id);
    TripulantRole save(TripulantRole tripulantRole);
    void deleteById(Long id);
}
