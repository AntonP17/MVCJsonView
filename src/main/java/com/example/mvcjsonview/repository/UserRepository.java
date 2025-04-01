package com.example.mvcjsonview.repository;

import com.example.mvcjsonview.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}