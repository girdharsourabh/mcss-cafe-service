package com.sourabh.mcsscoffeeservice.mapper;

import com.sourabh.mcsscoffeeservice.domain.Coffee;
import com.sourabh.mcsscoffeeservice.model.CoffeeDTO;
import org.mapstruct.Mapper;

@Mapper(uses = DateMapper.class)
public interface CoffeeMapper {
    CoffeeDTO coffeeToCoffeeDto(Coffee coffee);
    Coffee coffeeDtoToCoffee(CoffeeDTO coffeeDto);
}
