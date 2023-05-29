package com.example.appcarros.dto.Customer;

import com.example.appcarros.entity.Customer;

public record CustomerResponseDTO(Long id, String name, String image, String email, Long phone) {

    public CustomerResponseDTO(Customer customer) {
        this(customer.getId(), customer.getName(), customer.getImage(), customer.getEmail(), customer.getPhone());
    }
}
