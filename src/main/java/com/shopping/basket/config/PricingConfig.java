package com.shopping.basket.config;

import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Logger;

import com.shopping.basket.app.main.ShoppingBasketCalculatorService;
import com.shopping.basket.util.Constants;

/**
 * This configuration class fetches properties from application.properties file
 * 
 */
public class PricingConfig {
	
	private static final Logger logger = Logger.getLogger(PricingConfig.class.getName());
    private static final String CONFIG_FILE = Constants.APPLICATION_PROP_PATH;
    private static int maxItemsInBasket;
    
    static  {
    	loadConfig();
    }
	
	public static void loadConfig() {
		
		try (InputStream inputStream = PricingConfig.class.getResourceAsStream(CONFIG_FILE)) {
			
            Properties properties = new Properties();
            properties.load(inputStream);
            maxItemsInBasket = Integer.parseInt(properties.getProperty(Constants.PROP_MAX_ITEMS_IN_BASKET));
            
        } catch (Exception e) {
            logger.info("Exception Occurred in PricingConfig :" + e.getMessage());
            //Default number of items in basket if loadConfig method fails
            maxItemsInBasket = Constants.MAX_ITEMS_IN_BASKET_DEFAULT_VALUE;
        }

	}
	
	public static int getMaxItemsInBasket () {
		return maxItemsInBasket;
	}
	
}