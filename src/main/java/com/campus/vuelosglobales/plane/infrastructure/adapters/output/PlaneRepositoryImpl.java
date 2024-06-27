package com.campus.vuelosglobales.plane.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.plane.domain.entities.Plane;
import com.campus.vuelosglobales.plane.domain.repositories.PlaneRepository;

@Component
public class PlaneRepositoryImpl implements PlaneRepository {

    private final PlanePersistenceAdapter planePersistenceAdapter;

    public PlaneRepositoryImpl(PlanePersistenceAdapter planePersistenceAdapter) {
        this.planePersistenceAdapter = planePersistenceAdapter;
    }

    @Override
    public List<Plane> findAll() {
        return planePersistenceAdapter.findAll();
    }

    @Override
    public Optional<Plane> findById(Long id) {
        return planePersistenceAdapter.findById(id);
    }

    @Override
    public Plane save(Plane plane) {
        return planePersistenceAdapter.save(plane);
    }

    @Override
    public void deleteById(Long id) {
        planePersistenceAdapter.deleteById(id);
    }
}
