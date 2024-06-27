package com.campus.vuelosglobales.status.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.status.domain.entities.Status;

@Repository
public interface StatusPersistenceAdapter extends JpaRepository<Status, Long> {
}
