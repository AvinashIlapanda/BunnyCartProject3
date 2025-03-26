package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Locators.bunnycartPage1Object;
import com.aventstack.extentreports.Status;

public class bunnycartPage1 extends Browser {
	static {
        init("BunnyCartPage1_Report"); 
    } 

 
	//click on the create button
	public static void clickcreateAccount() {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click Create Account Button");
		    logger1.log(Status.INFO, "Attempting to click Create Account button");

    	try {
			bunnycartPage1Object.clickcreateAccount().click();
			 logger1.log(Status.PASS, "Successfully clicked Create Account button");

		} catch (Exception e) {
			System.out.println(e);
			  logger1.log(Status.FAIL, "Failed to click Create Account button: " + e);

		}
    	extent.flush();

    }
	//Entering the first name in firstname field
    public static void FirstName(String data) {
    	 logger1 = extent.createTest("Enter First Name");
		 logger1.log(Status.INFO, "Entering First Name: "+data);

    	
    	try {
    		
			bunnycartPage1Object.enterFirstName().sendKeys(data);
			 logger1.log(Status.PASS, "Successfully entered First Name: "+data);

		} catch (Exception e) {
          	System.out.println(e);
            logger1.log(Status.FAIL, "Failed to enter First Name: " + e);

          }
    	extent.flush();

     }
    
    //Entering the lastname in lastname field
    public static void LastName(String str) {
    	
    	logger1 = extent.createTest("Enter Last Name");
	    logger1.log(Status.INFO, "Entering Last Name: " + str);

    	try {
    		
    		bunnycartPage1Object.enterlastName().sendKeys(str);
    		 logger1.log(Status.PASS, "Successfully entered Last Name: " + str);

		} catch (Exception e) {
          	System.out.println(e);
          	 logger1.log(Status.FAIL, "Failed to enter Last Name: " + e);

		}
    	extent.flush();

          }
    
    //Entering the Email in Email field
    public static void emailfield(String str) {
    	
    	logger1 = extent.createTest("Enter Email");
		    logger1.log(Status.INFO, "Entering Email: " + str);
    	try {
    		bunnycartPage1Object.enterEmail().sendKeys(str);
    		 logger1.log(Status.PASS, "Successfully entered Email: " + str);

		} catch (Exception e) {
          	System.out.println("Email" +e);
          	 logger1.log(Status.FAIL, "Failed to enter Email: " + e);

		}    
    	extent.flush();

    }
    
    //Entering the Password
    public static void password(String str) {
    	 logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering Password");

    	try {
    		bunnycartPage1Object.enterPassword().sendKeys(str);
    		 logger1.log(Status.PASS, "Successfully entered Password");

		} catch (Exception e) {
          	System.out.println("Password" +e);
          	logger1.log(Status.FAIL, "Failed to enter Password: " + e);


		}
    	 extent.flush();

    }  
    
    //Entering the Conform Password
    public static void confirmPassword(String str) {
    	 logger1 = extent.createTest("Enter Invalid Confirm Password");
		    logger1.log(Status.INFO, "Entering Invalid Confirm Password");

    	try {
    		bunnycartPage1Object.enterConfirmPassword().sendKeys(str);
    		 logger1.log(Status.PASS, "Successfully entered Invalid Confirm Password");

		} catch (Exception e) {
          	System.out.println("confirmPassword" +e);
          	 logger1.log(Status.FAIL, "Failed to enter Invalid Confirm Password: " + e);

		}
    	 extent.flush();

    }
    
    //Entering the mobile number
    public static void mobileNumber(String str) {
    	logger1 = extent.createTest("Enter Mobile Number");
	    logger1.log(Status.INFO, "Entering Mobile Number: " + str);

    	try {
    		bunnycartPage1Object.enterNumber().sendKeys(str);
    		 logger1.log(Status.PASS, "Successfully entered Mobile Number: " + str);

		} catch (Exception e) {
          	System.out.println("Mobile number" +e);
          	 logger1.log(Status.FAIL, "Failed to enter Mobile Number: " + e);

		}
    	extent.flush();

    }
    
    //Click on the Create button
    public static void Create() {
    	 logger1 = extent.createTest("Click Create Account Button");
		 logger1.log(Status.INFO, "Clicking the Create Account Button");

    	try {
    		bunnycartPage1Object.create().click();
    		  logger1.log(Status.PASS, "Successfully clicked the Create Account Button");

    	}catch (Exception e) {
    		System.out.println("page1 - created account");
    		logger1.log(Status.FAIL, "Failed to click Create Account Button: " + e);

    	}
    }
    public static void erroMessage() {
    	System.out.println("Error in text");
    }

}
