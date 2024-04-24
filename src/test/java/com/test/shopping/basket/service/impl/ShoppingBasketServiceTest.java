package com.test.shopping.basket.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.service.impl.ShoppingBasketServiceImpl;
import com.shopping.basket.util.ShoppingBasketStrategySelector;
import com.shopping.basket.vo.Item;

public class ShoppingBasketServiceTest {
	
	@Test
	 public void testCalculateTotalPrice() {
		 
		 ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		 
		 Item apple = new Item("apple", ShoppingBasketStrategySelector.getStrategy("apple"));
		 Item banana = new Item("banana", ShoppingBasketStrategySelector.getStrategy("banana"));
		 Item melon = new Item("melon", ShoppingBasketStrategySelector.getStrategy("melon"));
		 Item lime = new Item("lime", ShoppingBasketStrategySelector.getStrategy("lime"));
		 basket.addItem(apple);
		 basket.addItem(banana);
		 basket.addItem(melon);
		 basket.addItem(lime);
		 System.out.println(basket.calculateFinalBill());
		 assertEquals(1.20, basket.calculateFinalBill(),0);
		 
	 }

}
