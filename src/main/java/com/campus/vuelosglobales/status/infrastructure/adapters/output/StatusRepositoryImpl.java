package com.campus.vuelosglobales.status.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.status.domain.entities.Status;
import com.campus.vuelosglobales.status.domain.repositories.StatusRepository;

@Component
public class StatusRepositoryImpl implements StatusRepository {

    private final StatusPersistenceAdapter statusPersistenceAdapter;

    public StatusRepositoryImpl(StatusPersistenceAdapter statusPersistenceAdapter) {
        this.statusPersistenceAdapter = statusPersistenceAdapter;
    }

    @Override
    public List<Status> findAll() {
        return statusPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Status> findById(Long id) {
        return statusPersistenceAdapter.findById(id);
    }

    @Override
    public Status save(Status status) {
        return statusPersistenceAdapter.save(status);
    }

    @Override
    public void deleteById(Long id) {
        statusPersistenceAdapter.deleteById(id);
    }
}
