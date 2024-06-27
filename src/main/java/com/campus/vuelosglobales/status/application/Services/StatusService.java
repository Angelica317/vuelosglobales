package com.campus.vuelosglobales.status.application.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.campus.vuelosglobales.status.domain.entities.Status;
import com.campus.vuelosglobales.status.domain.repositories.StatusRepository;

@Service
public class StatusService {

    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    public Status findById(Long id) {
        return statusRepository.findById(id).orElse(null);
    }

    public Status save(Status status) {
        return statusRepository.save(status);
    }

    public void deleteById(Long id) {
        statusRepository.deleteById(id);
    }
}
