package com.specner.examples.simple.repository;


import com.specner.examples.simple.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface JPARepository extends CrudRepository<User, Integer> {
}
