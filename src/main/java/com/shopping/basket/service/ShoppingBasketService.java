package com.shopping.basket.service;

import java.util.Map;

import com.shopping.basket.vo.Item;

/**
 * This interface provides 2 methods required by shopping basket
 */
public interface ShoppingBasketService {
	
	
	public void addItem(Item item);
	
	public double calculateFinalBill ();
	
	public Map<String, Integer> calculateFinalQuantity();

}
