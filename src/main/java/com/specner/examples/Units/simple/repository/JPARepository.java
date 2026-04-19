package com.specner.examples.Units.simple.repository;


import com.specner.examples.Units.simple.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface JPARepository extends CrudRepository<User, Integer> {
}
