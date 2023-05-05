package com.formation.lab.service;

import com.formation.lab.dto.UserDto;
import com.formation.lab.entity.User;

public interface UserService {
    UserDto createUser(User user);

    UserDto getUser(Long id);
}
