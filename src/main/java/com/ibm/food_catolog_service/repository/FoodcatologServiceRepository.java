package com.ibm.food_catolog_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.food_catolog_service.entity.FoodItem;
@Repository
public interface FoodcatologServiceRepository extends JpaRepository<FoodItem, Integer> {

	List<FoodItem> findByRestaurantId(int restaurantId);

	

}
