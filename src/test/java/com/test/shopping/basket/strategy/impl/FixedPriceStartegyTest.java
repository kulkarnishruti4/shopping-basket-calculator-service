package com.test.shopping.basket.strategy.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.strategy.impl.FixedPriceStrategy;

public class FixedPriceStartegyTest {
	
	 @Test
	 public void testCalculatePrice() {
		 
		 FixedPriceStrategy strategy = new FixedPriceStrategy(0.35);
		 
	     assertEquals(0.35, strategy.calculatePrice(1), 0);
	     
	     assertEquals(3.5, strategy.calculatePrice(10), 0);
	        
	    }
	 

}
