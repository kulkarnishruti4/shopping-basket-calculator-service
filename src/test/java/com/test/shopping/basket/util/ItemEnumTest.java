package com.test.shopping.basket.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.util.ItemEnum;

public class ItemEnumTest {

	
	@Test
	public void itemEnumTotalNumTest() {
		
		assertEquals(4, ItemEnum.values().length);
		
	}
	
	@Test
	public void itemEnumNameTest() {
		
		assertEquals("APPLE", ItemEnum.APPLE.name());
		assertEquals("BANANA", ItemEnum.BANANA.name());
		assertEquals("MELON", ItemEnum.MELON.name());
		assertEquals("LIME", ItemEnum.LIME.name());
		
	}
	
	@Test
	public void itemEnumPriceTest() {
		
		assertEquals(0.35, ItemEnum.APPLE.getPrice(), 0);
		assertEquals(0.20, ItemEnum.BANANA.getPrice(), 0);
		assertEquals(0.50, ItemEnum.MELON.getPrice(), 0);
		assertEquals(0.15, ItemEnum.LIME.getPrice(), 0);
		
	}
	
}
