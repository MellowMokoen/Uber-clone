package com.example.uberclone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripRequestDTO {

    private String origin;
    private String destination;
    private Double suggested_price;
}
