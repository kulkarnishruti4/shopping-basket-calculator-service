package com.shopping.basket.strategy.impl;

import com.shopping.basket.strategy.PricingStrategy;

/**
 * This Strategy is implemented by default for calculating price of an item
 */
public class FixedPriceStrategy implements PricingStrategy{
	
	private double price;
	
	public FixedPriceStrategy (double price) {
		
		this.price = price;
	}
	
	@Override
	public double calculatePrice(int quantity) {
		
		return price*quantity;
		
	}
}
