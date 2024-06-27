package com.campus.vuelosglobales.plane.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.plane.domain.entities.Plane;

@Repository
public interface PlanePersistenceAdapter extends JpaRepository<Plane, Long> {
}
