package com.test.shopping.basket.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.strategy.ShoppingBasketPricingStrategy;
import com.shopping.basket.util.ShoppingBasketStrategySelector;

public class ShoppingBasketStrategySelectorTest {
	
	@Test
	public void testGetStrategyForApple() {
		
		ShoppingBasketPricingStrategy strategy = ShoppingBasketStrategySelector.getStrategy("apple");
		
		assertEquals(0.35, strategy.calculatePrice(1), 0);
		
	}
	
	@Test
	public void testGetStrategyForBanana() {
		
		ShoppingBasketPricingStrategy strategy = ShoppingBasketStrategySelector.getStrategy("banana");
		
		assertEquals(0.20, strategy.calculatePrice(1), 0);
	}
	
	@Test
	public void testGetStrategyForMelon() {
		
		ShoppingBasketPricingStrategy strategy = ShoppingBasketStrategySelector.getStrategy("melon");
		
		assertEquals(0.50, strategy.calculatePrice(1), 0);
		
	}
	
	@Test
	public void testGetStrategyForLime() {
		
		ShoppingBasketPricingStrategy strategy = ShoppingBasketStrategySelector.getStrategy("lime");
		
		assertEquals(0.15, strategy.calculatePrice(1), 0);
		
	}
	
	public void testGetStrategyForDefault() {
		
		ShoppingBasketPricingStrategy strategy = ShoppingBasketStrategySelector.getStrategy("Kiwi");
		
		assertEquals(0, strategy.calculatePrice(1), 0);
		
	}
	

}
