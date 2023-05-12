package com.formation.lab.repository;

import com.formation.lab.entity.Deal;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealRepository extends CrudRepository<Deal, Long> {

  List<Deal> findAllByUserId(Long userId);
}
