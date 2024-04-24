package com.shopping.basket.app.main;

import java.util.Scanner;
import java.util.logging.Logger;

import com.shopping.basket.service.impl.ShoppingBasketServiceImpl;
import com.shopping.basket.strategy.ShoppingBasketPricingStrategy;
import com.shopping.basket.util.ItemEnum;
import com.shopping.basket.util.ShoppingBasketStrategySelector;
import com.shopping.basket.vo.Item;

/**
 * @author ShrutiKulkarni
 * This is the main class of Shopping Basket Bill Calculator service. 
 * It will take dynamic input of items and display the total price of all items added in the basket.
 * 
 */
public class ShoppingBasketCalculatorService {
	
	private static final Logger logger = Logger.getLogger(ShoppingBasketCalculatorService.class.getName());
	
	public static void main(String[] args) {
		
		ShoppingBasketServiceImpl shoppingBasket = new ShoppingBasketServiceImpl();
		try (Scanner scanner = new Scanner(System.in)) {
			
			System.out.println("Please input the name of items to be added in the Basket and press 'Enter'. Press 'Enter' again to finish adding items.");
			//We have taken singular nouns of items since items are presented one at a time. Quantity=1 by default.
			System.out.println("Your options are :" + ItemEnum.getItemNames());
			
			while(true) {
				
				String itemName = scanner.nextLine();
				if(itemName.equals(""))
					break;
				
				ShoppingBasketPricingStrategy pricingStrategy = ShoppingBasketStrategySelector.getStrategy(itemName.toLowerCase());
				Item item = new Item(itemName, pricingStrategy);
				shoppingBasket.addItem(item);
			}
		}
		double finalPriceOfBasket = shoppingBasket.calculateFinalBill();
		logger.info("Final price calculated successfully : £"+ finalPriceOfBasket);
		System.out.println("Final Price of Basket is: £" + finalPriceOfBasket);

	}

}
