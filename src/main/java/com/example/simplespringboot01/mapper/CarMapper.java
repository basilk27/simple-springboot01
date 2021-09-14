package com.example.simplespringboot01.mapper;

import com.example.simplespringboot01.dto.CarDto;
import com.example.simplespringboot01.dto.WheelDto;
import com.example.simplespringboot01.model.Car;
import com.example.simplespringboot01.model.Wheels;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

import java.util.List;
//import org.mapstruct.extensions.spring.converter.ConversionServiceAdapter;

@Mapper
//@Mapper(uses = ConversionServiceAdapter.class)
public interface CarMapper extends Converter<Car, CarDto> {

    @Mapping(target = "seats", source = "seatConfiguration")
    CarDto convert(Car car);
}
