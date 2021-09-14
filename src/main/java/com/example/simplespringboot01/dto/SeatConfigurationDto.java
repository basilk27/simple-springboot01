package com.example.simplespringboot01.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
public class SeatConfigurationDto {

    private int seatCount;
    private String material;
}
