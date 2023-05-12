package com.formation.lab.mapper;

import com.formation.lab.dto.DealDto;
import com.formation.lab.dto.UserDto;
import com.formation.lab.entity.Deal;
import com.formation.lab.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );


    UserDto userToUserDto(User user);

    User userDtoToUser(UserDto userDto);
}