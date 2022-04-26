package com.celloscope.springbootdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celloscope.springbootdatabase.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String> {

}
