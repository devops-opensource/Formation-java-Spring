package com.formation.lab.mapper;

import com.formation.lab.dto.DealDto;
import com.formation.lab.entity.Deal;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DealMapper {

    DealMapper INSTANCE = Mappers.getMapper(DealMapper.class);

    DealDto dealToDealDto(Deal deal);
}