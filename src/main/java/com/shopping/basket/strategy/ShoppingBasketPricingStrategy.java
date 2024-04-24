package com.shopping.basket.strategy;

/**
 * Interface to be implemented by all other Strategy classes
 */
public interface ShoppingBasketPricingStrategy {
	
	double calculatePrice(int quantity);

}
