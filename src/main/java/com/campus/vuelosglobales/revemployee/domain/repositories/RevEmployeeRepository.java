package com.campus.vuelosglobales.revemployee.domain.repositories;

import java.util.List;
import java.util.Optional;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployee;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployeePK;

public interface RevEmployeeRepository {
    List<RevEmployee> findAll();
    Optional<RevEmployee> findById(RevEmployeePK id);
    RevEmployee save(RevEmployee revEmployee);
    void deleteById(RevEmployeePK id);
}