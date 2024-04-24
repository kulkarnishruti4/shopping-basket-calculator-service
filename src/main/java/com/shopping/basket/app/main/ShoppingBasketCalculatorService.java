package com.shopping.basket.app.main;

import java.util.Scanner;
import java.util.logging.Logger;

import com.shopping.basket.service.impl.ShoppingBasketImpl;
import com.shopping.basket.strategy.PricingStrategy;
import com.shopping.basket.util.StrategySelector;
import com.shopping.basket.vo.Item;

/**
 * @author ShrutiKulkarni
 * 
 * This is the main class of Shopping Basket Bill Calculator service. 
 * It will take dynamic input of items and display the total price of all items added in the basket.
 * 
 */
public class ShoppingBasketCalculatorService {
	
	private static final Logger logger = Logger.getLogger(ShoppingBasketCalculatorService.class.getName());
	
	public static void main(String[] args) {
		
		ShoppingBasketImpl shoppingBasket = new ShoppingBasketImpl();
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Please enter the name of items to be added in the Basket. Enter 'over' when finished.");
			
			//We have taken singular version of items since requirement says items are presented one at a time. Quantity=1 by default.
			System.out.println("Your options are : Apple, Banana, Melon and Lime.");
			
			while(true) {
				
				String itemName = scanner.nextLine();
				if(itemName.equalsIgnoreCase("over"))
					break;
				
				PricingStrategy pricingStrategy = StrategySelector.getStrategy(itemName.toLowerCase());
				Item item = new Item(itemName, pricingStrategy);
				shoppingBasket.addItem(item);
			}
		}
		double finalPriceOfBasket = shoppingBasket.calculateFinalBill();
		logger.info("Final price calculated successfully : £"+ finalPriceOfBasket);
		System.out.println("Final Price of Basket is: £" + finalPriceOfBasket);

	}

}
