package com.campus.vuelosglobales.model.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.model.domain.entities.Model;
import com.campus.vuelosglobales.model.domain.repositories.ModelRepository;

@Service
public class ModelService {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    public List<Model> findAll() {
        return modelRepository.findAll();
    }

    public Model findById(Long id) {
        return modelRepository.findById(id).orElse(null);
    }

    public Model save(Model model) {
        return modelRepository.save(model);
    }

    public void deleteById(Long id) {
        modelRepository.deleteById(id);
    }
}
