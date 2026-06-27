package com.leela.diet_mgmt.controller;

import com.leela.diet_mgmt.model.DietPlan;
import com.leela.diet_mgmt.model.User;
import com.leela.diet_mgmt.repository.UserRepository;
import com.leela.diet_mgmt.service.DietService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/diet")
@CrossOrigin
public class DietController {

    @Autowired
    private DietService service;

    @Autowired
    private UserRepository userRepo;

    // ✅ Add diet plan (without user)
    @PostMapping("/add")
    public DietPlan addPlan(@RequestBody DietPlan plan) {
        return service.savePlan(plan);
    }

    // ✅ Get all diet plans
    @GetMapping("/all")
    public List<DietPlan> getAllPlans() {
        return service.getAllPlans();
    }

    // ✅ Assign diet plan to a user (ADMIN FEATURE)
    @PostMapping("/assign/{userId}")
    public DietPlan assignPlan(@PathVariable int userId, @RequestBody DietPlan plan) {

        User user = userRepo.findById(userId).orElse(null);

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        plan.setUser(user);
        return service.savePlan(plan);
    }

    // ✅ Delete diet plan
    @DeleteMapping("/delete/{id}")
    public String deletePlan(@PathVariable int id) {
        service.deletePlan(id);
        return "Deleted Successfully";
    }

    // ✅ Update diet plan
    @PutMapping("/update/{id}")
    public DietPlan updatePlan(@PathVariable int id, @RequestBody DietPlan plan) {
        plan.setId(id);
        return service.savePlan(plan);
    }
}