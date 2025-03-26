package com.BunnyCart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Locators.bunnycartPage3Object;
import com.aventstack.extentreports.Status;

import bunnyCart.ScreenShot.ScreenShot;

public class bunnycartPage3 extends Browser {
	static {
        init("BunnyCartPage3_Report"); 
    } 
	
	
	//Click on the Signin button
	public static void homepagesignin() {
		extent.attachReporter(reporter);
	    logger1 = extent.createTest("Click on open a Signin page");
	    logger1.log(Status.INFO, "Attempting to click SignIn Page");
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement homepagesigninbtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='link authorization-link create_an_account .login-link']")));
			homepagesigninbtn.click();
		bunnycartPage3Object.homepagesignin();
		logger1.log(Status.PASS, "Successfully Opens The SignIn Page");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			 logger1.log(Status.FAIL, "Fails To Opening The SignIn Page");
		}
		extent.flush();
		
		}
	
	//Click on the signin button
	public static void signinbutton() {
		 logger1 = extent.createTest("Click on SignIn Button");
		    logger1.log(Status.INFO, "Attempting to Click On SignIN Button");
		try {
			bunnycartPage3Object.signinbutton().click();
			ScreenShot.screenShot("SignIn picture1");
			logger1.log(Status.PASS, "Successfully Clicking The SignIn Button");
		}catch(Exception e){
			System.out.println(e.getMessage());
			 logger1.log(Status.FAIL, "Fails To Clicking The SignIn Page");
		}
		extent.flush();
		}
	
	//Entering the Email in signin page
	public static void signinmail(String data) {
		logger1 = extent.createTest("Entering The Email");
	    logger1.log(Status.INFO, "Attempting to Entering The Email");
		try {
			
			bunnycartPage3Object.signinmail().sendKeys(data);
			logger1.log(Status.PASS, "Successfully Enters The Email");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			logger1.log(Status.FAIL, "Fails To Searching The Product");
	    }
		extent.flush();
	}
	
	//Entering the password in signin page
	public static void signinpass(String data) {
		logger1 = extent.createTest("Entering The Password");
	    logger1.log(Status.INFO, "Attempting to Entering The Password");
		try {
			bunnycartPage3Object.signinpass().sendKeys(data);
			ScreenShot.screenShot("SignIn picture");
			logger1.log(Status.PASS, "Successfully Enters The Password");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			logger1.log(Status.FAIL, "Fails To Entering The Password");
		}
		extent.flush();
	}



}
