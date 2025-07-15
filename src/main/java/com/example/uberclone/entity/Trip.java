package com.example.uberclone.entity;

import com.example.uberclone.enums.TripStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Driver;
import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String origin;

    private String destination;

    private TripStatus status;

    private LocalDateTime created_at;

    private LocalDateTime accepted_at;

    private LocalDateTime completed_at;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private User passenger;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private User driver;

    @PrePersist
    public void prePersist() {
        this.created_at = LocalDateTime.now();
        this.status = TripStatus.PENDING;
    }

}
