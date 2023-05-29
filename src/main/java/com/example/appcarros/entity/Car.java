package com.example.appcarros.entity;

import com.example.appcarros.dto.Car.CarRequestDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cars")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Car {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private Double price;
    private String image;
    private int year;
    private String color;
    private int numberOfPorts;
    
    public Car(CarRequestDTO data) {
        this.model = data.model();
        this.price = data.price();
        this.image = data.image();
        this.year = data.year();
        this.color = data.color();
        this.numberOfPorts = data.numberOfPorts();
    }
}
