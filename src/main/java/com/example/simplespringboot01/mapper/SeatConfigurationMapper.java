package com.example.simplespringboot01.mapper;

import com.example.simplespringboot01.dto.SeatConfigurationDto;
import com.example.simplespringboot01.model.SeatConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper
public interface SeatConfigurationMapper extends Converter<SeatConfiguration, SeatConfigurationDto> {

    @Mapping(target = "seatCount", source = "numberOfSeats")
    @Mapping(target = "material", source = "seatMaterial")
    SeatConfigurationDto convert(SeatConfiguration seatConfiguration);
}
