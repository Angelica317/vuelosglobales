package com.campus.vuelosglobales.model.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.model.domain.entities.Model;
import com.campus.vuelosglobales.model.domain.repositories.ModelRepository;

@Component
public class ModelRepositoryImpl implements ModelRepository {

    private final ModelPersistenceAdapter modelPersistenceAdapter;

    public ModelRepositoryImpl(ModelPersistenceAdapter modelPersistenceAdapter) {
        this.modelPersistenceAdapter = modelPersistenceAdapter;
    }

    @Override
    public List<Model> findAll() {
        return modelPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Model> findById(Long id) {
        return modelPersistenceAdapter.findById(id);
    }

    @Override
    public Model save(Model model) {
        return modelPersistenceAdapter.save(model);
    }

    @Override
    public void deleteById(Long id) {
        modelPersistenceAdapter.deleteById(id);
    }
}
