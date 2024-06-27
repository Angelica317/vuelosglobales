package com.campus.vuelosglobales.model.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.model.domain.entities.Model;

@Repository
public interface ModelPersistenceAdapter extends JpaRepository<Model, Long> {
}
