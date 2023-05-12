package com.formation.lab.dto;

import lombok.Data;

import java.util.Date;

@Data
public class DealDto {
    private Date date;

    private Long quantity;

    private String symbol;

    private double unityPrice;

    private String companyName;

    private UserDto user;
}
