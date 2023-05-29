package com.example.appcarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appcarros.dto.Customer.CustomerRequestDTO;
import com.example.appcarros.dto.Customer.CustomerResponseDTO;
import com.example.appcarros.entity.Customer;
import com.example.appcarros.repository.CustomerRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepository repository;
    
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCustomer(@RequestBody CustomerRequestDTO data) {
        Customer customerData = new Customer(data); 
        repository.save(customerData);
        return;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CustomerResponseDTO> getAll() {
        
        List<CustomerResponseDTO> customerList = repository.findAll().stream().map(CustomerResponseDTO::new).toList();
        return customerList;
    }
}
