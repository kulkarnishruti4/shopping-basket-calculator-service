package com.test.shopping.basket.app.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.service.impl.ShoppingBasketImpl;
import com.shopping.basket.util.StrategySelector;
import com.shopping.basket.vo.Item;

public class ShoppingBasketCalculatorServiceTest {
	
	@Test
	 public void testCalculateTotalPrice() {
		 
		 ShoppingBasketImpl basket = new ShoppingBasketImpl();
		 
		 Item apple = new Item("apple", StrategySelector.getStrategy("apple"));
		 Item banana = new Item("banana", StrategySelector.getStrategy("banana"));
		 basket.addItem(apple);
		 basket.addItem(banana);
		 assertEquals(basket.calculateFinalBill(),0.55,0);
		 
	 }
	
	@Test
	 public void testCalculateTotalPriceBuyOneGetOne() {
		 
		 ShoppingBasketImpl basket = new ShoppingBasketImpl();
		 
		 Item melon = new Item("melon", StrategySelector.getStrategy("melon"));
		 basket.addItem(melon);
		 basket.addItem(melon);
		 assertEquals(basket.calculateFinalBill(), 0.50,0);
		 
	 }
	
	@Test
	 public void testCalculateTotalPriceBuyTwoForOne() {
		 
		 ShoppingBasketImpl basket = new ShoppingBasketImpl();
		 
		 Item lime = new Item("lime", StrategySelector.getStrategy("lime"));
		 basket.addItem(lime);
		 basket.addItem(lime);
		 basket.addItem(lime);
		 assertEquals(basket.calculateFinalBill(), 0.30,0);
		 
	 }


}
