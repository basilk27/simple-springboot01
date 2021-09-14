package com.example.simplespringboot01.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//@Builder
@NoArgsConstructor
public class CarDto {

    private String make;
    private SeatConfigurationDto seats;
    private String type;
    //private List<WheelDto> wheels;
}
