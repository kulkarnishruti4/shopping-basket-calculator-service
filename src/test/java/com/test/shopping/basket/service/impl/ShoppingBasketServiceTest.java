package com.test.shopping.basket.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.shopping.basket.service.impl.ShoppingBasketServiceImpl;
import com.shopping.basket.util.ShoppingBasketStrategySelector;
import com.shopping.basket.vo.Item;

public class ShoppingBasketServiceTest {
	
	@Test
	public void testAdditem() {
		
		Item apple = new Item("apple", ShoppingBasketStrategySelector.getStrategy("apple"));
		ShoppingBasketServiceImpl service = new ShoppingBasketServiceImpl();
		
		service.addItem(apple);
		
		assertEquals(0.35, service.calculateFinalBill(),0);
	}
	
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
		 
		 assertEquals(1.20, basket.calculateFinalBill(),0);
		 
	 }
	
	@Test
	public void testCalculateFinalQuantity() {
		  
		ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		 Map<String, Integer> finalQuantityMap = new HashMap<>();
		 
		assertEquals(finalQuantityMap, basket.calculateFinalQuantity());
		  
		
	}

}
