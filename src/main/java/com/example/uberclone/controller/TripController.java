package com.example.uberclone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Driver;
import java.util.List;

@RestController
@RequestMapping("/api/v1/trips")
public class TripController {

    @GetMapping
    public List<Driver> getAllDrivers() {
        return List.of();
    }
}
