package com.specner.examples.Units.springDataJPA.repository;

import com.specner.examples.Units.springDataJPA.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Laptop, Integer> {

}
