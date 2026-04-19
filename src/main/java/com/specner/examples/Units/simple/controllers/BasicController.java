package com.specner.examples.Units.simple.controllers;

import com.specner.examples.Units.simple.entity.User;
import com.specner.examples.Units.simple.repository.JPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BasicController {

    JPARepository jpaRepository;

    @Autowired
    public BasicController(JPARepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return (List<User>) jpaRepository.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user) {
        return jpaRepository.save(user);
    }
}
