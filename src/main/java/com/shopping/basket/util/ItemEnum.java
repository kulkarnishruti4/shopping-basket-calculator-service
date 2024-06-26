package com.shopping.basket.util;

import java.util.Arrays;

/**
 * ENUM for Items and their prices.
 * Ideally this will be stored in the database
 */
public enum ItemEnum {
	
	APPLE(0.35),
	BANANA(0.20),
	MELON(0.50),
	LIME(0.15);
	
	private final double price;
	
	private ItemEnum(double price) {
	this.price = price;	
	}
	
	public double getPrice() {
		return price;
	}
	
	public static String getItemNames() {
		String[] names = Arrays.stream(ItemEnum.values())
			.map(Enum::name)
			.toArray(String[]::new);
		return Arrays.toString(names);
	}
	

}
