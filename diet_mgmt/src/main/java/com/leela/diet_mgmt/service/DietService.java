package com.leela.diet_mgmt.service;

import com.leela.diet_mgmt.model.DietPlan;
import com.leela.diet_mgmt.repository.DietPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service   // ⭐ VERY IMPORTANT
public class DietService {

    @Autowired
    private DietPlanRepository repo;

    // ✅ SAVE / ADD
    public DietPlan savePlan(DietPlan plan) {
        return repo.save(plan);
    }

    // ✅ GET ALL
    public List<DietPlan> getAllPlans() {
        return repo.findAll();
    }

    // ✅ DELETE
    public void deletePlan(int id) {
        repo.deleteById(id);
    }
}