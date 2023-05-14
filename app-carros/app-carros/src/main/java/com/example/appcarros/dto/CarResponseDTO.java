package com.example.appcarros.dto;

import com.example.appcarros.entity.Car;

public record CarResponseDTO(Long id, String model, Double price, String image, int year, String color, int numberOfPorts) {
    
    public CarResponseDTO(Car car) {
        this(car.getId(), car.getModel(), car.getPrice(), car.getImage(), car.getYear(), car.getColor(), car.getNumberOfPorts());

    }
}
