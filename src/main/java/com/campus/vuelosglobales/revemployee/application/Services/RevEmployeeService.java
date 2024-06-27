package com.campus.vuelosglobales.revemployee.application.Services;

import java.util.List;
import org.springframework.stereotype.Service;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployee;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployeePK;
import com.campus.vuelosglobales.revemployee.domain.repositories.RevEmployeeRepository;

@Service
public class RevEmployeeService {
    private final RevEmployeeRepository revEmployeeRepository;

    public RevEmployeeService(RevEmployeeRepository revEmployeeRepository) {
        this.revEmployeeRepository = revEmployeeRepository;
    }

    public List<RevEmployee> findAll() {
        return revEmployeeRepository.findAll();
    }

    public RevEmployee findById(RevEmployeePK id) {
        return revEmployeeRepository.findById(id).orElse(null);
    }

    public RevEmployee save(RevEmployee revEmployee) {
        return revEmployeeRepository.save(revEmployee);
    }

    public void deleteById(RevEmployeePK id) {
        revEmployeeRepository.deleteById(id);
    }
}