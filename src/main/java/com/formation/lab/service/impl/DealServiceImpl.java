package com.formation.lab.service.impl;

import com.formation.lab.dto.DealDto;
import com.formation.lab.entity.Deal;
import com.formation.lab.mapper.DealMapper;
import com.formation.lab.repository.DealRepository;
import com.formation.lab.service.DealService;

import org.springframework.stereotype.Service;

@Service
public class DealServiceImpl implements DealService {

  private final DealRepository dealRepository;


  public DealServiceImpl(DealRepository dealRepository) {
    this.dealRepository = dealRepository;
  }

  @Override
  public DealDto createDeal(Deal deal) {
    return DealMapper.INSTANCE.dealToDealDto(dealRepository.save(deal));
  }
}
