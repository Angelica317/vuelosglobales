package com.campus.vuelosglobales.manufacturer.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.manufacturer.domain.entities.Manufacturer;
import com.campus.vuelosglobales.manufacturer.domain.repositories.ManufacturerRepository;

@Component
public class ManufacturerRepositoryImpl implements ManufacturerRepository {

    private final ManufacturerPersistenceAdapter manufacturerPersistenceAdapter;

    public ManufacturerRepositoryImpl(ManufacturerPersistenceAdapter manufacturerPersistenceAdapter) {
        this.manufacturerPersistenceAdapter = manufacturerPersistenceAdapter;
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturerPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Manufacturer> findById(Long id) {
        return manufacturerPersistenceAdapter.findById(id);
    }

    @Override
    public Manufacturer save(Manufacturer manufacturer) {
        return manufacturerPersistenceAdapter.save(manufacturer);
    }

    @Override
    public void deleteById(Long id) {
        manufacturerPersistenceAdapter.deleteById(id);
    }
}
