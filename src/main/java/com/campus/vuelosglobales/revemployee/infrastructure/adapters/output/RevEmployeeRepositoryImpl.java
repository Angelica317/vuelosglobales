package com.campus.vuelosglobales.revemployee.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployee;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployeePK;
import com.campus.vuelosglobales.revemployee.domain.repositories.RevEmployeeRepository;

@Component
public class RevEmployeeRepositoryImpl implements RevEmployeeRepository {
    private final RevEmployeePersistenceAdapter revEmployeePersistenceAdapter;

    public RevEmployeeRepositoryImpl(RevEmployeePersistenceAdapter revEmployeePersistenceAdapter) {
        this.revEmployeePersistenceAdapter = revEmployeePersistenceAdapter;
    }

    @Override
    public List<RevEmployee> findAll() {
        return revEmployeePersistenceAdapter.findAll();
    }

    @Override
    public Optional<RevEmployee> findById(RevEmployeePK id) {
        return revEmployeePersistenceAdapter.findById(id);
    }

    @Override
    public RevEmployee save(RevEmployee revEmployee) {
        return revEmployeePersistenceAdapter.save(revEmployee);
    }

    @Override
    public void deleteById(RevEmployeePK id) {
        revEmployeePersistenceAdapter.deleteById(id);
    }
}