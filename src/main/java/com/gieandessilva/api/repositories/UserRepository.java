package com.gieandessilva.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gieandessilva.api.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
