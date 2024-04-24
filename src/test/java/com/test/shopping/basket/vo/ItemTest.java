package com.test.shopping.basket.vo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.shopping.basket.strategy.impl.FixedPriceStrategy;
import com.shopping.basket.vo.Item;

public class ItemTest {
	
	@Test
    public void testCalculatePrice() {
		
        Item apple = new Item("apple", new FixedPriceStrategy(0.35));
        
        assertEquals(0.35, apple.calculatePrice(1), 0);
    }

}
