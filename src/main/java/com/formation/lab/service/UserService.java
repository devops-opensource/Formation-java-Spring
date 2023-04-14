package com.formation.lab.service;

import com.formation.lab.entity.User;

public interface UserService {
    User createUser(User user);

    User getUser(Long id);
}
