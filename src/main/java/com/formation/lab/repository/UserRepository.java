package com.formation.lab.repository;

import com.formation.lab.entity.Deal;
import com.formation.lab.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
