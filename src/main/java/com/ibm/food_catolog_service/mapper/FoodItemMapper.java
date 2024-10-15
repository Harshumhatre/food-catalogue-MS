package com.ibm.food_catolog_service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ibm.food_catolog_service.dto.FoodItemDto;
import com.ibm.food_catolog_service.entity.FoodItem;

@Mapper
public interface FoodItemMapper {
	FoodItemMapper INASTANCE=Mappers.getMapper(FoodItemMapper.class);
	
	FoodItem mapToFoodItemDtoToFoodItem(FoodItemDto foodItemDto);
	FoodItemDto mapToFoodIemToFoodItemDto(FoodItem foodItem);
}
