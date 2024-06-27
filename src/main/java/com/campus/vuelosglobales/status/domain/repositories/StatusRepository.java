package com.campus.vuelosglobales.status.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.status.domain.entities.Status;

public interface StatusRepository {
    List<Status> findAll();
    Optional<Status> findById(Long id);
    Status save(Status status);
    void deleteById(Long id);
}
