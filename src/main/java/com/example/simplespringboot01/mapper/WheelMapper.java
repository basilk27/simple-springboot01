package com.example.simplespringboot01.mapper;

import com.example.simplespringboot01.dto.WheelDto;
import com.example.simplespringboot01.model.Wheel;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;
//import org.mapstruct.extensions.spring.converter.ConversionServiceAdapter;

@Mapper
//@Mapper(uses = ConversionServiceAdapter.class)
public interface WheelMapper extends Converter<Wheel, WheelDto> {

    @Override
    WheelDto convert(Wheel source);
}
