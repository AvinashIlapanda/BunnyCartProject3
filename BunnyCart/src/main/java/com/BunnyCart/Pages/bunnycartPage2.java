package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Locators.bunnycartPage2Object;
import com.BunnyCart.Locators.bunnycartPage3Object;
import com.aventstack.extentreports.Status;

public class bunnycartPage2 extends Browser{
	static {
        init("BunnyCartPage2_Report"); 
    } 

	 // Method to open the Sign In page
    public static void openSignInPage() {
    	extent.attachReporter(reporter);
	    logger1 = extent.createTest("Click on open a Signin page");
	    logger1.log(Status.INFO, "Attempting to click SignIn Page");
        try {
        	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement homepagesigninbtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='link authorization-link create_an_account .login-link']")));
    			homepagesigninbtn.click();
    		
            bunnycartPage2Object.signin().click(); // Clicking on the Sign In link
            logger1.log(Status.PASS, "Successfully Opens The SignIn Page");
        } catch (Exception e) {
            System.out.println("Error opening Sign In page: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails to Opening the SignIn Page");
        }
        extent.flush();
    }

    // Method to input the email in the email field
    public static void inputEmail(String email) {
    	logger1 = extent.createTest("Enter The Email");
	    logger1.log(Status.INFO, "Entering The Email");
        try {
        	bunnycartPage2Object.enteremailfield().sendKeys(email); // Entering email into the email field
        	logger1.log(Status.PASS, "Successfully Enters The Email Data");
        } catch (Exception e) {
            System.out.println("Error entering email: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails to enter the email");
        }
        extent.flush();
    }

    // Method to input the password in the password field
    public static void inputPassword(String password) {
    	logger1 = extent.createTest("Enter The Password");
	    logger1.log(Status.INFO, "Entering The Password");
        try {
        	bunnycartPage2Object.enterpasswordfield().sendKeys(password); // Entering password into the password field
        	logger1.log(Status.PASS, "Successfully Enters The Password Data");
        } catch (Exception e) {
            System.out.println("Error entering password: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails To Enters The Password Data");
        }
        extent.flush();
    }
    // Method to click the Sign In button
    public static void clickSignInButton() {
    	logger1 = extent.createTest("Clicking The SignIn Button");
	    logger1.log(Status.INFO, "Clicking The SignIn");
        try {
        	bunnycartPage2Object.buttonsigin().click(); // Clicking the Sign In button
        	logger1.log(Status.PASS, "Successfully Clicking The SignIn Button");
        } catch (Exception e) {
            System.out.println("Error clicking Sign In button: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails To Clicking The SignIN BUtton ");
        }
        extent.flush();
    }

    // Method to search for a product
    public static void searchForProduct(String product) {
    	logger1 = extent.createTest("Searching For Product");
	    logger1.log(Status.INFO, "Searching The Product");
        try {
        	bunnycartPage2Object.searchproduct().sendKeys(product); // Typing the product name in the search field
        	logger1.log(Status.PASS, "Successfully Searching The Product");
        	
        } catch (Exception e) {
            System.out.println("Error searching product: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails To Searching The Product");
            
        }
        extent.flush();
    }

    // Method to select a product from the search results
    public static void selectFirstProduct() {
    	logger1 = extent.createTest("Searching For Product1");
	    logger1.log(Status.INFO, "Searching The Product1");
        try {
        	bunnycartPage2Object.allProducts();
        	bunnycartPage2Object.selectProduct().click(); // Selecting the first product in the results
        	logger1.log(Status.PASS, "Successfully Searching The Product1");
        } catch (Exception e) {
            System.out.println("Error selecting product: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails Searching The Product");
            }
        extent.flush();
    }
    // Method to click on the product quantity (if applicable)
    public static void selectProductQuantity() {
    	logger1 = extent.createTest("Entering The Product Quantity");
	    logger1.log(Status.INFO, "Entering The Product Quantity");
        try {
        	bunnycartPage2Object.clickquantity().click(); // Clicking on the quantity field
        	logger1.log(Status.PASS, "Successfull Entering The Quantity");
        } catch (Exception e) {
            System.out.println("Error selecting quantity: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails To Searching The Product");
           }
        extent.flush();
    }

    // Method to add the selected product to the cart
    public static void addProductToCart() {
    	logger1 = extent.createTest("Add That Product Into The Cart");
	    logger1.log(Status.INFO, "Adding The Product Into The Cart");
        try {
        	bunnycartPage2Object.addcart().click();
        	logger1.log(Status.PASS, "Successfull Adds The Product In The Cart");
        	Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Error adding product to cart: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails to Searching The Product");
           }
        extent.flush();
    }

    // Method to open the shopping cart
    public static void openShoppingCart() {
    	logger1 = extent.createTest("Cheking The Product Is Added Or Not");
	    logger1.log(Status.INFO, "Checking The Product Is Added or Not");
        try {
        	bunnycartPage2Object.clickcartbutton().click(); // Clicking on the Cart button to open the shopping cart
        	logger1.log(Status.PASS, "Add The Product Successfully In Cart");
        } catch (Exception e) {
            System.out.println("Error opening shopping cart: " + e.getMessage());
            logger1.log(Status.FAIL, "Fails To  Adds The Product In The Cart");
        }
        extent.flush();
    }
    // Method to close the shopping cart
    public static void closeShoppingCart() {
    	logger1 = extent.createTest("Closing The Cart");
	    logger1.log(Status.INFO, "Closing The Cart");
    	try {
    		bunnycartPage2Object.closecart().click();
    		logger1.log(Status.PASS, "Successfully Closing The Cart");
    	}
    	catch(Exception e) {
    		System.out.println("Error in closing"+e.getMessage());
    		logger1.log(Status.FAIL,"Fails To Closing The Cart");
    	}
    	extent.flush();
    }
}
