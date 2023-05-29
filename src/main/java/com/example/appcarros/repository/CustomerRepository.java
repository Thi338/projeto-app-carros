package com.example.appcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appcarros.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
