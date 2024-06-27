package com.campus.vuelosglobales.model.infrastructure.adapters.input;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campus.vuelosglobales.model.application.Services.ModelService;
import com.campus.vuelosglobales.model.domain.entities.Model;

@RestController
@RequestMapping("/models")
public class ModelController {

    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.findAll();
    }

    @GetMapping("/{id}")
    public Model getModelById(@PathVariable Long id) {
        return modelService.findById(id);
    }

    @PostMapping
    public Model createModel(@RequestBody Model model) {
        return modelService.save(model);
    }

    @PutMapping("/{id}")
    public Model updateModel(@PathVariable Long id, @RequestBody Model model) {
        model.setId(id);
        return modelService.save(model);
    }

    @DeleteMapping("/{id}")
    public void deleteModel(@PathVariable Long id) {
        modelService.deleteById(id);
    }
}
