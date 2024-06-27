package com.campus.vuelosglobales.gate.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.gate.domain.entities.Gate;
import com.campus.vuelosglobales.gate.domain.repositories.GateRepository;

@Service
public class GateService {

    private final GateRepository gateRepository;

    public GateService(GateRepository gateRepository) {
        this.gateRepository = gateRepository;
    }

    public List<Gate> findAll() {
        return gateRepository.findAll();
    }

    public Gate findById(Long id) {
        return gateRepository.findById(id).orElse(null);
    }

    public Gate save(Gate gate) {
        return gateRepository.save(gate);
    }

    public void deleteById(Long id) {
        gateRepository.deleteById(id);
    }
}
