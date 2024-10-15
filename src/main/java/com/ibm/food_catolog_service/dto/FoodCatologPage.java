package com.ibm.food_catolog_service.dto;

import java.util.List;

import com.ibm.food_catolog_service.entity.FoodItem;

public class FoodCatologPage {
	private List<FoodItem> foodItemsList;
	private Restaurant restaurant;

	public List<FoodItem> getFoodItemsList() {
		return foodItemsList;
	}

	public void setFoodItemsList(List<FoodItem> foodItemsList) {
		this.foodItemsList = foodItemsList;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public FoodCatologPage(List<FoodItem> foodItemsList, Restaurant restaurant) {
		super();
		this.foodItemsList = foodItemsList;
		this.restaurant = restaurant;
	}

	public FoodCatologPage() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodCatologPage [foodItemsList=" + foodItemsList + ", restaurant=" + restaurant + "]";
	}

}
