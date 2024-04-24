package com.shopping.basket.util;

import com.shopping.basket.strategy.PricingStrategy;
import com.shopping.basket.strategy.impl.BuyOneGetOneFreeStrategy;
import com.shopping.basket.strategy.impl.BuyThreeforTwoStrategy;
import com.shopping.basket.strategy.impl.FixedPriceStrategy;

/**
 * Simple selector implementation for different items. Special offers can be modified here.
 * New Items can be directly configured here.
 */
public class StrategySelector {
	
	
	public static PricingStrategy getStrategy(String itemName) {
		
		switch(itemName) {
		
		case Constants.APPLE:
			return new FixedPriceStrategy(ItemEnum.APPLE.getPrice());
		case Constants.BANANA:
			return new FixedPriceStrategy(ItemEnum.BANANA.getPrice());
		case Constants.MELON:
			return new BuyOneGetOneFreeStrategy(ItemEnum.MELON.getPrice());
		case Constants.LIME:
			return new BuyThreeforTwoStrategy(ItemEnum.LIME.getPrice());
		default:
			throw new IllegalArgumentException("Above Item is not listed: "+ itemName);
		}
		
		
	}

}
