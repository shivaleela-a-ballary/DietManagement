package com.leela.diet_mgmt.model;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DietPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String breakfast;
    private String lunch;
    private String dinner;
    private int calories;

    private String suggestion;   // ⭐ NEW FIELD

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}