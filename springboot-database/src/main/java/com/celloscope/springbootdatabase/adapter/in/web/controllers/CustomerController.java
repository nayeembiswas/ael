package com.celloscope.springbootdatabase.adapter.in.web.controllers;

import com.celloscope.springbootdatabase.application.port.in.CustomerUseCase;
import com.celloscope.springbootdatabase.domain.Customer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    private final CustomerUseCase customerUseCase;

    public CustomerController(CustomerUseCase customerUseCase) {
        this.customerUseCase = customerUseCase;
    }

    @GetMapping("/customers/{id}")
    public ResponseEntity<Customer> findCustomer(@PathVariable String id){
        Customer customer = customerUseCase.getCustomer(id);
        if (customer != null) return ResponseEntity.ok(customer);
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/customers")
    public ResponseEntity<String> saveCustomer(@RequestBody Customer customer){
        String customerId = customerUseCase.saveCustomer(customer);
        if (customerId != null && !customerId.isBlank()) return ResponseEntity.ok(customerId);
        return ResponseEntity.badRequest().build();
    }
}
