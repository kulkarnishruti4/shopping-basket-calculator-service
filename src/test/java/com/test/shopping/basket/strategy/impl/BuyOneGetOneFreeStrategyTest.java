package com.test.shopping.basket.strategy.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.strategy.impl.BuyOneGetOneFreeStrategy;

public class BuyOneGetOneFreeStrategyTest {
	
	 @Test
	 public void testCalculatePrice() {
	      BuyOneGetOneFreeStrategy strategy = new BuyOneGetOneFreeStrategy(0.50);
	      //price of 1 item
	      assertEquals(0.50, strategy.calculatePrice(1), 0);
	      // price of 2 items
	      assertEquals(0.50, strategy.calculatePrice(2), 0);
	      // price of 3 items
	      assertEquals(1.0, strategy.calculatePrice(3), 0);
	    }

}
