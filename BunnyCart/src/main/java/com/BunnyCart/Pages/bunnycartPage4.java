package com.BunnyCart.Pages;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Locators.bunnycartPage4Object;
import com.aventstack.extentreports.Status;

public class bunnycartPage4 extends Browser{
	static {
        init("BunnyCartPage4_Report"); 
    } 
 
	 public static void searchForProduct(String product) {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Searching for The Product2");
		    logger1.log(Status.INFO, "Attempting The Searching For Product2");
	        try {
	        	bunnycartPage4Object.searchproduct().sendKeys(product); // Typing the product name in the search field
	        	logger1.log(Status.PASS, "Successfully Search The Product2");
	        	
	        } catch (Exception e) {
	            System.out.println("Error searching product: " + e.getMessage());
	            logger1.log(Status.FAIL, "Fails TO Searching The Product");
	          }
	        extent.flush();
	    }
	 public static void selectProductType() {
		 logger1 = extent.createTest("Selecting for The Product2");
		    logger1.log(Status.INFO, "Attempting The Selecting For Product2");
	        try {
	        	bunnycartPage4Object.clickType().click(); // Clicking on the quantity field
	        	logger1.log(Status.PASS, "Successfully Selects The Product2");
	        } catch (Exception e) {
	            System.out.println("Error selecting quantity: " + e.getMessage());
	            logger1.log(Status.FAIL, "Fails To Searching The Product");
	           }
	        extent.flush();
	    }
	 public static void addProductToCart() {
		 logger1 = extent.createTest("Adding The Product Into The Cart");
		    logger1.log(Status.INFO, "Attempting ToAdding The Product Into The Cart");
	        try {
	        	bunnycartPage4Object.addToCart().click();
	        	// Clicking on the "Add to Cart" button
	        	logger1.log(Status.PASS, "Successfully Adds The Product2");
	        	Thread.sleep(6000);
	        } catch (Exception e) {
	            System.out.println("Error adding product to cart: " + e.getMessage());
	            logger1.log(Status.FAIL, "Fails To Searching The Product");
	        }
	        extent.flush();
	    }
	 public static void openCart() {
		 logger1 = extent.createTest("Opening The Cart");
		    logger1.log(Status.INFO, "Attempting To Opens The Cart");
		 try {
			 bunnycartPage4Object.clickCart().click(); //open the Cart opttion for verifing the products
			 logger1.log(Status.PASS, "Successfully Opens The Cart");
		 }
		 catch(Exception e) {
			 System.out.println("Error in add to cart"+e.getMessage());
			 logger1.log(Status.FAIL, "Fails To Opens The Cart");
		 }
		 extent.flush();
	 }
	 public static void closeCart() {
		 logger1 = extent.createTest("Closing The Cart");
		    logger1.log(Status.INFO, "Attempting To Close The Cart");
		 try {
			 bunnycartPage4Object.closeCart().click();
			 logger1.log(Status.PASS, "Successfully Close The Cart");
		 }
		 catch(Exception e) {
			 System.out.println("Error in closing cart"+e);
			 logger1.log(Status.FAIL, "Fails To Closes The Cart");
		 }
		 extent.flush();
	 }
}
