package com.test.shopping.basket.strategy.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.strategy.impl.BuyThreeForTwoStrategy;

public class BuyThreeForTwoStrategyTest {
	
	@Test
    public void testCalculatePrice() {
		
        BuyThreeForTwoStrategy strategy = new BuyThreeForTwoStrategy(0.15);
        
        assertEquals(0, strategy.calculatePrice(0), 0);
        
        assertEquals(0.15, strategy.calculatePrice(1), 0);
        
        assertEquals(0.30, strategy.calculatePrice(2), 0);
        // price of 2 limes and 3 limes should be same
        assertEquals(0.30, strategy.calculatePrice(3), 0);
        
        assertEquals(0.45, strategy.calculatePrice(4), 0.1);
        
        assertEquals(0.6, strategy.calculatePrice(6), 0);
    }
	

}
