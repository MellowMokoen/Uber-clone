package com.example.uberclone.dto;

import com.example.uberclone.entity.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    private Integer id;
    private List<Car> car;
    private String driverName;
    private String driverImageUrl;
    private String number_plate;
    private String carImageUrl;
    private String carName;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}
