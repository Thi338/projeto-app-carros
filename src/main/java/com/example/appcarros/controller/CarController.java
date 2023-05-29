package com.example.appcarros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.appcarros.dto.Car.CarRequestDTO;
import com.example.appcarros.dto.Car.CarResponseDTO;
import com.example.appcarros.entity.Car;
import com.example.appcarros.repository.CarRepository;

import jakarta.transaction.Transactional;

@RestController
@RequestMapping("car")
public class CarController {
    
    @Autowired
    private CarRepository repository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveCar(@RequestBody CarRequestDTO data) {
        Car carData = new Car(data);
        repository.save(carData);
        return;
    } 

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<CarResponseDTO> getAll() {

        List<CarResponseDTO> carList = repository.findAll().stream().map(CarResponseDTO::new).toList();
        return carList;
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void deleteCar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
