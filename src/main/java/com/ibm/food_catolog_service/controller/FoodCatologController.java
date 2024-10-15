package com.ibm.food_catolog_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.food_catolog_service.dto.FoodCatologPage;
import com.ibm.food_catolog_service.dto.FoodItemDto;
import com.ibm.food_catolog_service.entity.FoodItem;
import com.ibm.food_catolog_service.service.FoodCatologService;

@RestController
@RequestMapping("/food-catalogue")
@CrossOrigin
public class FoodCatologController {
	
	@Autowired
	private FoodCatologService foodCatologService;
	
	@PostMapping("/add")
	public ResponseEntity<FoodItemDto> addFoodItem(@RequestBody FoodItemDto foodItemDto){
		FoodItemDto addFoodItems = this.foodCatologService.addFoodItems(foodItemDto);
		return new ResponseEntity<FoodItemDto>(addFoodItems, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/{restaurantId}")
	public ResponseEntity<FoodCatologPage> fetchFoodItemListAndRestaurantDetailsById(@PathVariable int restaurantId){
		FoodCatologPage fetchFoodItemListAndRestaurantDetailsById = this.foodCatologService.fetchFoodItemListAndRestaurantDetailsById(restaurantId);
		return new ResponseEntity<FoodCatologPage>(fetchFoodItemListAndRestaurantDetailsById, HttpStatus.OK);
	}
}
