package com.campus.vuelosglobales.tripulantrole.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.tripulantrole.domain.entities.TripulantRole;

@Repository
public interface TripulantRolePersistenceAdapter extends JpaRepository<TripulantRole, Long> {
}
