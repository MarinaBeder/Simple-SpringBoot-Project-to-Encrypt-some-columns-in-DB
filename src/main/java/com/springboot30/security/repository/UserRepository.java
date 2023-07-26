package com.springboot30.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot30.security.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
