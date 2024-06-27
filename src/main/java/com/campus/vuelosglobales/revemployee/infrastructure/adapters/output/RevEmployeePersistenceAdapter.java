package com.campus.vuelosglobales.revemployee.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployee;
import com.campus.vuelosglobales.revemployee.domain.entities.RevEmployeePK;

@Repository
public interface RevEmployeePersistenceAdapter extends JpaRepository<RevEmployee, RevEmployeePK> {
}