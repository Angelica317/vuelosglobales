package com.campus.vuelosglobales.customer.infrastructure.adapters.output;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.campus.vuelosglobales.customer.domain.entities.Customer;
import com.campus.vuelosglobales.customer.domain.repositories.CustomerRepository;

@Component
public class CustomerRepositoryImpl implements CustomerRepository {

    private final CustomerPersistenceAdapter customerPersistenceAdapter;

    public CustomerRepositoryImpl(CustomerPersistenceAdapter customerPersistenceAdapter) {
        this.customerPersistenceAdapter = customerPersistenceAdapter;
    }

    @Override
    public List<Customer> findAll() {
        return customerPersistenceAdapter.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerPersistenceAdapter.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerPersistenceAdapter.save(customer);
    }

    @Override
    public void deleteById(Long id) {
        customerPersistenceAdapter.deleteById(id);
    }
}
