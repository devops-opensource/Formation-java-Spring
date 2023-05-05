package com.formation.lab.controller;

import com.formation.lab.dto.UserDto;
import com.formation.lab.entity.User;
import com.formation.lab.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserDto createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable("id") Long id) {
       return userService.getUser(id);
    }


}
