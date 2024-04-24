package com.shopping.basket.strategy;

/**
 * Interface to be implemented by all other Strategy classes
 */
public interface PricingStrategy {
	
	double calculatePrice(int quantity);

}
