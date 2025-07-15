package com.example.uberclone.repository;

import com.example.uberclone.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

    Car findByDriverId(Integer id);


}
