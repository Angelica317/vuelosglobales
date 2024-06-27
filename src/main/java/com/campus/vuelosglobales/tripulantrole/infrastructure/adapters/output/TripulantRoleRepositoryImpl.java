package com.campus.vuelosglobales.tripulantrole.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.tripulantrole.domain.entities.TripulantRole;
import com.campus.vuelosglobales.tripulantrole.domain.repositories.TripulantRoleRepository;

@Component
public class TripulantRoleRepositoryImpl implements TripulantRoleRepository {

    private final TripulantRolePersistenceAdapter tripulantRolePersistenceAdapter;

    public TripulantRoleRepositoryImpl(TripulantRolePersistenceAdapter tripulantRolePersistenceAdapter) {
        this.tripulantRolePersistenceAdapter = tripulantRolePersistenceAdapter;
    }

    @Override
    public List<TripulantRole> findAll() {
        return tripulantRolePersistenceAdapter.findAll();
    }

    @Override
    public Optional<TripulantRole> findById(Long id) {
        return tripulantRolePersistenceAdapter.findById(id);
    }

    @Override
    public TripulantRole save(TripulantRole tripulantRole) {
        return tripulantRolePersistenceAdapter.save(tripulantRole);
    }

    @Override
    public void deleteById(Long id) {
        tripulantRolePersistenceAdapter.deleteById(id);
    }
}
