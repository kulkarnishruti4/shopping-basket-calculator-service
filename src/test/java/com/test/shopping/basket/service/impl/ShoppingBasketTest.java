package com.test.shopping.basket.service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.service.impl.ShoppingBasketImpl;
import com.shopping.basket.util.StrategySelector;
import com.shopping.basket.vo.Item;

public class ShoppingBasketTest {
	
	@Test
	 public void testCalculateTotalPrice() {
		 
		 ShoppingBasketImpl basket = new ShoppingBasketImpl();
		 
		 Item apple = new Item("apple", StrategySelector.getStrategy("apple"));
		 Item banana = new Item("banana", StrategySelector.getStrategy("banana"));
		 Item melon = new Item("melon", StrategySelector.getStrategy("melon"));
		 Item lime = new Item("lime", StrategySelector.getStrategy("lime"));
		 basket.addItem(apple);
		 basket.addItem(banana);
		 basket.addItem(melon);
		 basket.addItem(lime);
		 System.out.println(basket.calculateFinalBill());
		 assertEquals(basket.calculateFinalBill(),1.20,0);
		 
	 }

}
