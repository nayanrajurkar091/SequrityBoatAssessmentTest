package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
}