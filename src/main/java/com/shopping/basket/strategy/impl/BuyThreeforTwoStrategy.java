package com.shopping.basket.strategy.impl;

import com.shopping.basket.strategy.ShoppingBasketPricingStrategy;

/**
 * This Strategy is implemented when there is an offer on an item - Buy three for the price of two
 */
public class BuyThreeForTwoStrategy implements ShoppingBasketPricingStrategy{
	
	public double price;
	
	public BuyThreeForTwoStrategy(double price) {
		this.price = price;
	}
	
	@Override
	public double calculatePrice(int quantity) {
		
		/*(quantity / 3) * 2 -the number of sets of three items and multiplies by 2 to get the number of items the customer needs to pay for.
		quantity % 3 - calculates the remainder, which represents any remaining single items. */
		
		int paidQuantity = (quantity / 3) * 2 + quantity % 3;
		return paidQuantity*price;
		
	}

}
