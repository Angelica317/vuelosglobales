package com.campus.vuelosglobales.customer.domain.repositories;

import java.util.List;
import java.util.Optional;

import com.campus.vuelosglobales.customer.domain.entities.Customer;

public interface CustomerRepository {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer customer);
    void deleteById(Long id);
}
