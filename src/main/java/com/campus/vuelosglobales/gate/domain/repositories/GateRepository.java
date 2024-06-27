package com.campus.vuelosglobales.gate.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.gate.domain.entities.Gate;

public interface GateRepository {
    List<Gate> findAll();
    Optional<Gate> findById(Long id);
    Gate save(Gate gate);
    void deleteById(Long id);
}
