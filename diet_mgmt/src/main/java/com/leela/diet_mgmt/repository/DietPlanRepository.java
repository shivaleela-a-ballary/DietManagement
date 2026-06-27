package com.leela.diet_mgmt.repository;
import com.leela.diet_mgmt.model.DietPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DietPlanRepository extends JpaRepository<DietPlan, Integer> {
}