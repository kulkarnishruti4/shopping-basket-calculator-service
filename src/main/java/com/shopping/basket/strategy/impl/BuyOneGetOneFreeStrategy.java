package com.shopping.basket.strategy.impl;

import com.shopping.basket.strategy.ShoppingBasketPricingStrategy;

/**
 * This Strategy is implemented when there is an offer on an item - Buy one get one free
 */
public class BuyOneGetOneFreeStrategy implements ShoppingBasketPricingStrategy{

	private double price;
	
	public BuyOneGetOneFreeStrategy(double price) {
		this.price = price;
	}
	
	@Override
	public double calculatePrice(int quantity) {
		
		/*quantity / 2 - number of pairs of items.
		quantity % 2 - the remainder which represents any remaining single item. */
		
		int paidQuantity = quantity/2 + quantity %2;
		return paidQuantity*price;
	}
}
