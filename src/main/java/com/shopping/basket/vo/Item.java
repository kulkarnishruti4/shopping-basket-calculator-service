package com.shopping.basket.vo;

import com.shopping.basket.strategy.PricingStrategy;

/**
 * Vo class for Item
 */
public class Item {
	
	private String name;
	
	private PricingStrategy pricingStrategy;
	
	public Item(String name, PricingStrategy pricingStrategy) {
		this.name = name;
		this.pricingStrategy = pricingStrategy;
	}
	
	public String getName() {
		return name;
	}
	
	public double calculatePrice(int quantity) {
		return pricingStrategy.calculatePrice(quantity);
	}

}
