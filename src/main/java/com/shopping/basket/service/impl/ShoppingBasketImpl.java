package com.shopping.basket.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import com.shopping.basket.config.PricingConfig;
import com.shopping.basket.service.ShoppingBasket;
import com.shopping.basket.vo.Item;

/**
 * This class implements ShoppingBasket. It provides few basic functions for Basket - 
 * Add items to a List and Calculate final price of this List.
 */
public class ShoppingBasketImpl implements ShoppingBasket {

	private static final Logger logger = Logger.getLogger(ShoppingBasketImpl.class.getName());
	private static final int MAX_ITEMS_IN_BASKET = PricingConfig.getMaxItemsInBasket();

	private final List<Item> itemsList;
	
	public ShoppingBasketImpl() {	        
		itemsList = new ArrayList<>();
    }
	
	/**
	 * Adds item to the Basket List
	 * @param item
	 */
	public void addItem(Item item) {
		
		  if (itemsList.size() < MAX_ITEMS_IN_BASKET) {
	            itemsList.add(item);
	        } else {
	            logger.info("Maximum limit reached for Number of Items in Basket!");
	        }
	}
	
	/**
	 * Calculates price of all items in the final list.
	 * @return final price 
	 */
	public double calculateFinalBill () {
		logger.info("Calculating final Bill. Inside calculateFinalBill() @ShoppingBasketImpl");
	    // Calculate final quantity for each unique item
	    Map<String, Integer> finalQuantityMap = calculateFinalQuantity();
	    // Calculate total price based on final quantity and pricing strategy
	    double totalPrice = 0;
	    Set<String> processedItems = new HashSet<>(); // To track already processed items
	    
	    for (Item item : itemsList) {
	    	
	        String itemName = item.getName();
	        
	        if (!processedItems.contains(itemName)) {
	        	
	            int finalQuantity = finalQuantityMap.getOrDefault(itemName, 0);
	            double itemPrice = item.calculatePrice(finalQuantity);
	            totalPrice += itemPrice;
	            processedItems.add(itemName); // Mark the item as processed
	        }
	    }
	    return totalPrice;
	}
	
	/**
	 * Calculates final quantity of each item inputted by the user.
	 * @return
	 */
	public Map<String, Integer> calculateFinalQuantity() {
        Map<String, Integer> finalQuantityMap = new HashMap<>();
        
        for (Item item : itemsList) {
        	
            String itemName = item.getName();
            int previousQuantity = finalQuantityMap.getOrDefault(itemName, 0);
            finalQuantityMap.put(itemName, previousQuantity + 1);
        }
        logger.info("Final Quantity of Items: " + finalQuantityMap);
        return finalQuantityMap;
    }
	
}