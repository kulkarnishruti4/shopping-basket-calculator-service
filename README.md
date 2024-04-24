# Shopping Basket Calculator Service

This service scans the shopping basket and generates a bill based on different prices and offers.

## Description

This project implements a Strategy Pattern, wherein strategy for calculating the price of an 'Item' in the shopping basket, is decided dynamically. 
Currently three strategies are created - Fixed Price Strategy, 'Buy One Get One Free Strategy' and 'Buy Three for the Price of Two'.
Based on the Strategy and the price of an item, a final price is calculated for each item.

## Getting Started

### Dependencies

Java 8 or above

### Executing program

* The main class is 'com.shopping.basket.app.main.ShoppingBasketCalculatorService.java'
* Start the Java Application. Read the instructions on the Console. 
* On the console, type in the item name to add Items to Shopping Basket.
* Once the required items are added, double press 'Enter' key in Windows or 'return' key in MAC OS.
* Final bill will be displayed on the console.

## Limitations

* Shopping Basket can carry only 100 items at a time.
* Only one item can be presented at a time.
* Items can be identified only by their given names.
* Final Bill is available only in Pounds.
* Accuracy of final bill can be considered up to the second decimal point.

## Assumptions

* Items once added to the basket need not be modified or removed.
* Offers and Prices of items can change frequently but no implementation/interface is needed for it right now.
* Unknown items can be ignored till they are added to the Application.
* Database is not available.


## Version History

* 0.2
    * Code optimizations and re-factoring
* 0.1
    * Initial Commit