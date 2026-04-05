package com.specner.examples.repository;


import com.specner.examples.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface JPARepository extends CrudRepository<User, Integer> {
}
