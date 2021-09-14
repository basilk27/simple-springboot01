package com.example.simplespringboot01.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
public class Wheel {

    private WheelPosition position;
    private int diameter;
}
