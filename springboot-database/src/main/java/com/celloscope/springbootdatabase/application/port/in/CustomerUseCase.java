package com.celloscope.springbootdatabase.application.port.in;

import com.celloscope.springbootdatabase.domain.Customer;

public interface CustomerUseCase {
    Customer getCustomer(String customerId);
    String saveCustomer(Customer customer);
}
