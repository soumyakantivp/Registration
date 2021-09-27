package com.example.registration.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	Optional<User> findByEmail(String email);
}
