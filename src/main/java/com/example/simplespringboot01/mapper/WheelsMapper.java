package com.example.simplespringboot01.mapper;

import com.example.simplespringboot01.dto.WheelDto;
import com.example.simplespringboot01.model.Wheels;
import org.mapstruct.Mapper;
import org.springframework.core.convert.converter.Converter;

import java.util.List;
//import org.mapstruct.extensions.spring.converter.ConversionServiceAdapter;

@Mapper
//@Mapper(uses = ConversionServiceAdapter.class)
public interface WheelsMapper extends Converter<Wheels, List<WheelDto>> {

    @Override
    List<WheelDto> convert(Wheels source);
}
