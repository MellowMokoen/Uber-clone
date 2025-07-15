package com.example.uberclone.mapper;

import com.example.uberclone.dto.CarDTO;
import com.example.uberclone.dto.CarRequestDTO;
import com.example.uberclone.entity.Car;
import com.example.uberclone.entity.User;
import org.springframework.stereotype.Component;

@Component
public class CarMapper {

    // MAP TO DTO

    public static CarDTO toCarDTO(Car car) {
        CarDTO carDTO = new CarDTO();
        carDTO.setId(car.getId());
        carDTO.setCarName(car.getCarName());
        carDTO.setDriverName(car.getDriver().getName());
        carDTO.setCarImageUrl(car.getCarImageUrl());

        return carDTO;
    }

    // MAP TO ENTITY

    public static Car toCarEntity(CarRequestDTO carRequestDTO, User driver) {
        Car car = new Car();

        car.setCarName(carRequestDTO.getDriver_id());
        car.setNumber_plate(carRequestDTO.getNumber_plate());
        car.setCarImageUrl(carRequestDTO.getImage_url());
        car.setDriver(driver);

        return car;
    }
}
