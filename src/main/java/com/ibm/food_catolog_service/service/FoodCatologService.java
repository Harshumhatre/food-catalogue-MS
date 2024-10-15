package com.ibm.food_catolog_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibm.food_catolog_service.dto.FoodCatologPage;
import com.ibm.food_catolog_service.dto.FoodItemDto;
import com.ibm.food_catolog_service.dto.Restaurant;
import com.ibm.food_catolog_service.entity.FoodItem;
import com.ibm.food_catolog_service.mapper.FoodItemMapper;
import com.ibm.food_catolog_service.repository.FoodcatologServiceRepository;
@Service
public class FoodCatologService {
	
	@Autowired
	private FoodcatologServiceRepository foodcatologServiceRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public FoodItemDto addFoodItems(FoodItemDto foodItemDto) {
		FoodItem save = this.foodcatologServiceRepository.save(FoodItemMapper.INASTANCE.mapToFoodItemDtoToFoodItem(foodItemDto));
		return FoodItemMapper.INASTANCE.mapToFoodIemToFoodItemDto(save);
	}

	public FoodCatologPage fetchFoodItemListAndRestaurantDetailsById(int restaurantId) {
		List<FoodItem> foodItems=fetchFoodItems(restaurantId);
		Restaurant restaurant=fetchRestaurantByRestaurantId(restaurantId);
		FoodCatologPage foodCatologPage=new FoodCatologPage();
		foodCatologPage.setFoodItemsList(foodItems);
		foodCatologPage.setRestaurant(restaurant);
		
		return foodCatologPage;
	}

	private Restaurant fetchRestaurantByRestaurantId(int restaurantId) {
		Restaurant Restaurant = this.restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurant/get/"+restaurantId, Restaurant.class);
		return Restaurant;
	}

	private List<FoodItem> fetchFoodItems(int restaurantId) {
		List<FoodItem> findByRestaurantId = this.foodcatologServiceRepository.findByRestaurantId(restaurantId);
		return findByRestaurantId;
	}

}
