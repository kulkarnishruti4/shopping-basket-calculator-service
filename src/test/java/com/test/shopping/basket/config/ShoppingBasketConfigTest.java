package com.test.shopping.basket.config;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.config.ShoppingBasketConfig;

public class ShoppingBasketConfigTest {

	
	@Test
	public void loadConfigTest() {
		
		int maxItems = ShoppingBasketConfig.getMaxItemsInBasket();
		
		assertEquals(100, maxItems);
		
	}
	
	
}
