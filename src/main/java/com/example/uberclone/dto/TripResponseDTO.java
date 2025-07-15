package com.example.uberclone.dto;

import com.example.uberclone.enums.TripStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TripResponseDTO {

    private UserDTO passenger;
    private UserDTO driver;
    private String origin;
    private String destination;
    private Double suggested_price;
    private String created_at;
    private String updated_at;
    private String completed_at;
    private TripStatus status;

}
