package com.ibm.food_catolog_service.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class FoodItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

    private String itemName;

    private String itemDescription;

    private boolean isVeg;

    private Long price;

    private Integer restaurantId;

    @Column(nullable = false, columnDefinition = "INT DEFAULT 0")
    private Integer quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public boolean isVeg() {
		return isVeg;
	}

	public void setVeg(boolean isVeg) {
		this.isVeg = isVeg;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getRestaurantId() {
		return restaurantId;
	}

	public void setRestaurantId(Integer restaurantId) {
		this.restaurantId = restaurantId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public FoodItem(int id, String itemName, String itemDescription, boolean isVeg, Long price, Integer restaurantId,
			Integer quantity) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
		this.isVeg = isVeg;
		this.price = price;
		this.restaurantId = restaurantId;
		this.quantity = quantity;
	}

	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "FoodItem [id=" + id + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", isVeg="
				+ isVeg + ", price=" + price + ", restaurantId=" + restaurantId + ", quantity=" + quantity + "]";
	}
    
    
}
