package com.test.shopping.basket.app.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.service.impl.ShoppingBasketServiceImpl;
import com.shopping.basket.util.ShoppingBasketStrategySelector;
import com.shopping.basket.vo.Item;

public class ShoppingBasketCalculatorServiceTest {
	
	@Test
	 public void testCalculateTotalPrice() {
		 
		 ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		 
		 Item apple = new Item("apple", ShoppingBasketStrategySelector.getStrategy("apple"));
		 Item banana = new Item("banana", ShoppingBasketStrategySelector.getStrategy("banana"));
		 basket.addItem(apple);
		 basket.addItem(banana);
		 assertEquals(0.55, basket.calculateFinalBill(),0);
		 
	 }
	
	@Test
	 public void testCalculateTotalPriceBuyOneGetOne() {
		 
		 ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		 
		 Item melon = new Item("melon", ShoppingBasketStrategySelector.getStrategy("melon"));
		 basket.addItem(melon);
		 basket.addItem(melon);
		 assertEquals(0.50, basket.calculateFinalBill(), 0);
		 
	 }
	
	@Test
	 public void testCalculateTotalPriceBuyTwoForOne() {
		 
		 ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		 
		 Item lime = new Item("lime", ShoppingBasketStrategySelector.getStrategy("lime"));
		 basket.addItem(lime);
		 basket.addItem(lime);
		 basket.addItem(lime);
		 assertEquals(0.30, basket.calculateFinalBill(),0);
		 
	 }
	
	@Test
	public void testAddingMaxItemsInBasket() {
		
		ShoppingBasketServiceImpl basket = new ShoppingBasketServiceImpl();
		Item apple = new Item("apple", ShoppingBasketStrategySelector.getStrategy("apple"));
		//assertThrows(IllegalStateException.class, ()->ShoppingBasketCalculatorService.printShoppingBasketBill());
		try {
		for(int i=0; i<=101; i++) {
			basket.addItem(apple);
		}
		} catch(IllegalStateException e) {
			assertEquals("Maximum limit exceeded.", e.getMessage());
		}

	}


}
