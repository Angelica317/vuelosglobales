package com.campus.vuelosglobales.plane.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.plane.domain.entities.Plane;
import com.campus.vuelosglobales.plane.domain.repositories.PlaneRepository;

@Service
public class PlaneService {

    private final PlaneRepository planeRepository;

    public PlaneService(PlaneRepository planeRepository) {
        this.planeRepository = planeRepository;
    }

    public List<Plane> findAll() {
        return planeRepository.findAll();
    }

    public Plane findById(Long id) {
        return planeRepository.findById(id).orElse(null);
    }

    public Plane save(Plane plane) {
        return planeRepository.save(plane);
    }

    public void deleteById(Long id) {
        planeRepository.deleteById(id);
    }
}
