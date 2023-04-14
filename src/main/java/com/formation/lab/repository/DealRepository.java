package com.formation.lab.repository;

import com.formation.lab.entity.Deal;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository {

  List<Deal> findAllByUserId(Long userId);
}
