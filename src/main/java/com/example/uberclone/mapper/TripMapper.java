package com.example.uberclone.mapper;

import com.example.uberclone.dto.TripRequestDTO;
import com.example.uberclone.entity.Trip;
import com.example.uberclone.entity.User;

public class TripMapper {

    // TRIP REQUEST DTO TO ENTITY (passenger create a new trip)

    public static Trip toEntity(TripRequestDTO tripRequestDTO, User user) {
        Trip trip = new Trip();
        trip.setOrigin(tripRequestDTO.getOrigin());
        trip.setDestination(tripRequestDTO.getDestination());
        trip.setSuggested_price(tripRequestDTO.getSuggested_price());
        trip.setPassenger(user);

        return trip;
    }

    // ENTITY TO TRIP RESPONSE DTO

    public static TripRequestDTO toDTO(Trip trip, User passenger, User driver) {
        TripRequestDTO tripRequestDTO = new TripRequestDTO();
        tripRequestDTO.setOrigin(trip.getOrigin());
        tripRequestDTO.setDestination(trip.getDestination());
        tripRequestDTO.setSuggested_price(trip.getSuggested_price());

        return tripRequestDTO;
    }
}
