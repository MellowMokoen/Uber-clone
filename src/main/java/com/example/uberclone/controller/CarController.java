package com.example.uberclone.controller;

import com.example.uberclone.entity.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cars")
public class CarController {

    @GetMapping
    public List<Car> getAllCars() {
        return null;
    }
}
