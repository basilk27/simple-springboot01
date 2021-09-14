package com.example.simplespringboot01.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SeatConfiguration {

    private int numberOfSeats;
    private SeatMaterial seatMaterial;
}
