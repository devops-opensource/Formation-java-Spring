package com.formation.lab.service.impl;

import com.formation.lab.entity.User;
import com.formation.lab.repository.UserRepository;
import com.formation.lab.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Value("${my.personalised.variable}")
    private String myPersonalVariable;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        logger.info("création d'un nouvel utilisateur");
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public User getUser(Long id) {
        logger.info("retour du user avec l'id :" + id);
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}