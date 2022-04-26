package com.celloscope.springbootdatabase.adapter.out.persistence;

import com.celloscope.springbootdatabase.application.port.out.CustomerPersistencePort;
import com.celloscope.springbootdatabase.domain.Customer;
import com.celloscope.springbootdatabase.repository.CustomerRepository;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerPersistenceAdapter implements CustomerPersistencePort {
    //TODO: Create CustomerEntity
    //TODO: Create CustomerRepository
	
	@Autowired 
    private CustomerRepository repo;
	
    @Override
    public Customer get(String customerId) {
        return repo.findById(customerId).get();
    }

    @Override
    public String save(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        Customer saveEntity = repo.save(customer);
        return saveEntity.getId();
    }
}
