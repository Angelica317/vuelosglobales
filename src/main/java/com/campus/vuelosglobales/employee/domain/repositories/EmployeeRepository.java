package com.campus.vuelosglobales.employee.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.employee.domain.entities.Employee;

public interface EmployeeRepository {
    List<Employee> findAll();
    Optional<Employee> findById(Long id);
    Employee save(Employee employee);
    void deleteById(Long id);
}
