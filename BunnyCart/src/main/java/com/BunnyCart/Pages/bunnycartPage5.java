package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;

import com.BunnyCart.Locators.bunnycartPage5Object;
import com.aventstack.extentreports.Status;

import bunnyCart.ScreenShot.ScreenShot;

public class bunnycartPage5 extends Browser{
	static {
        init("BunnyCartPage5_Report"); 
    } 
   
	//After signin The user click on the Signout button
	public static void signOutbutton() {
		extent.attachReporter(reporter);
	    logger1 = extent.createTest("Clicking The SignOut Button");
	    logger1.log(Status.INFO, "Attempting To Clicking The SignOut Button");
		try {
			
			bunnycartPage5Object.signOut().click();
			ScreenShot.screenShot("Signout picture");
			logger1.log(Status.PASS, "Successfully Clicks The SdignOut Button");
		}catch(Exception e){
			System.out.println(e.getMessage());
			logger1.log(Status.FAIL, "Fails To Clicking The SignOut Button ");
		}
		extent.flush();
		}
}
