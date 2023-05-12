package com.formation.lab.controller;

import com.formation.lab.dto.DealDto;
import com.formation.lab.entity.Deal;
import com.formation.lab.service.DealService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deal")
public class DealController {

  private final DealService dealService;

  public DealController(DealService dealService) {
    this.dealService = dealService;
  }

  @PostMapping("/create")
  public DealDto createDeal(@RequestBody Deal deal) {
    return dealService.createDeal(deal);
  }

}
