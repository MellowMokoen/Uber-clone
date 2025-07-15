package com.example.uberclone.repository;

import com.example.uberclone.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip,Integer> {

    Optional<Trip> findByDriverId(Integer id);


}
