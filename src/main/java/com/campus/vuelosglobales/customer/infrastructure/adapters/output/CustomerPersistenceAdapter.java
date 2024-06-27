package com.campus.vuelosglobales.customer.infrastructure.adapters.output;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.campus.vuelosglobales.customer.domain.entities.Customer;

@Repository
public interface CustomerPersistenceAdapter extends JpaRepository<Customer, Long> {
}
