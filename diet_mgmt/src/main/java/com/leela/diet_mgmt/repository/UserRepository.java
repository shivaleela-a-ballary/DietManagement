package com.leela.diet_mgmt.repository;
import com.leela.diet_mgmt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}