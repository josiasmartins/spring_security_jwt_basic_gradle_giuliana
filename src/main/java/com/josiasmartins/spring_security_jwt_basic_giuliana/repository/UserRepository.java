package com.josiasmartins.spring_security_jwt_basic_giuliana.repository;

import com.josiasmartins.spring_security_jwt_basic_giuliana.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, String> {
    Optional<User> findByUsername(String username);
}