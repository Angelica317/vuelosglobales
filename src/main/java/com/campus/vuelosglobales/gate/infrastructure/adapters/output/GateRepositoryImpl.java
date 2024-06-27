package com.campus.vuelosglobales.gate.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.gate.domain.entities.Gate;
import com.campus.vuelosglobales.gate.domain.repositories.GateRepository;

@Component
public class GateRepositoryImpl implements GateRepository {

    private final GatePersistenceAdapter gatePersistenceAdapter;

    public GateRepositoryImpl(GatePersistenceAdapter gatePersistenceAdapter) {
        this.gatePersistenceAdapter = gatePersistenceAdapter;
    }

    @Override
    public List<Gate> findAll() {
        return gatePersistenceAdapter.findAll();
    }

    @Override
    public Optional<Gate> findById(Long id) {
        return gatePersistenceAdapter.findById(id);
    }

    @Override
    public Gate save(Gate gate) {
        return gatePersistenceAdapter.save(gate);
    }

    @Override
    public void deleteById(Long id) {
        gatePersistenceAdapter.deleteById(id);
    }
}
