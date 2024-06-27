package com.campus.vuelosglobales.employee.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.employee.domain.entities.Employee;

@Repository
public interface EmployeePersistenceAdapter extends JpaRepository<Employee, Long> {
}
