package com.celloscope.springbootdatabase.application.port.out;

import com.celloscope.springbootdatabase.domain.Customer;

public interface CustomerPersistencePort {
    Customer get(String customerId);
    String save(Customer customer);
}
