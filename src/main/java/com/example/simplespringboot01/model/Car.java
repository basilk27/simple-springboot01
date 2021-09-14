package com.example.simplespringboot01.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//@Builder
public class Car {

    private String make;
    private SeatConfiguration seatConfiguration;
    private CarType type;
    //private Wheels wheels;
}
