package com.formation.lab.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class UserDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;


}
