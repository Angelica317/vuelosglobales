package com.campus.vuelosglobales.employee.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.employee.domain.entities.Employee;
import com.campus.vuelosglobales.employee.domain.repositories.EmployeeRepository;

@Component
public class EmployeeRepositoryImpl implements EmployeeRepository {

    private final EmployeePersistenceAdapter employeePersistenceAdapter;

    public EmployeeRepositoryImpl(EmployeePersistenceAdapter employeePersistenceAdapter) {
        this.employeePersistenceAdapter = employeePersistenceAdapter;
    }

    @Override
    public List<Employee> findAll() {
        return employeePersistenceAdapter.findAll();
    }

    @Override
    public Optional<Employee> findById(Long id) {
        return employeePersistenceAdapter.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeePersistenceAdapter.save(employee);
    }

    @Override
    public void deleteById(Long id) {
        employeePersistenceAdapter.deleteById(id);
    }
}
