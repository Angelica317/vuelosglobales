package com.campus.vuelosglobales.tripulantrole.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.tripulantrole.domain.entities.TripulantRole;
import com.campus.vuelosglobales.tripulantrole.domain.repositories.TripulantRoleRepository;

@Service
public class TripulantRoleService {

    private final TripulantRoleRepository tripulantRoleRepository;

    public TripulantRoleService(TripulantRoleRepository tripulantRoleRepository) {
        this.tripulantRoleRepository = tripulantRoleRepository;
    }

    public List<TripulantRole> findAll() {
        return tripulantRoleRepository.findAll();
    }

    public TripulantRole findById(Long id) {
        return tripulantRoleRepository.findById(id).orElse(null);
    }

    public TripulantRole save(TripulantRole tripulantRole) {
        return tripulantRoleRepository.save(tripulantRole);
    }

    public void deleteById(Long id) {
        tripulantRoleRepository.deleteById(id);
    }
}
