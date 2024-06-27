package com.campus.vuelosglobales.gate.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.gate.domain.entities.Gate;

@Repository
public interface GatePersistenceAdapter extends JpaRepository<Gate, Long> {
}
