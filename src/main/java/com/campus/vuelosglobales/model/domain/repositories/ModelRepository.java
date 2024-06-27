package com.campus.vuelosglobales.model.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.model.domain.entities.Model;

public interface ModelRepository {
    List<Model> findAll();
    Optional<Model> findById(Long id);
    Model save(Model model);
    void deleteById(Long id);
}
