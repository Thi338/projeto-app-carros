package com.example.appcarros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.appcarros.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long>{
    
}
