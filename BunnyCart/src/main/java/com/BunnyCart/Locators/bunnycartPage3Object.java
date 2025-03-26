package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class bunnycartPage3Object extends Browser {

	public static By homepagesignin = By.xpath("//a[@class='customer-login-link']");
	public static By signinbutton = By.xpath("//button[@id='send2-login']");
	public static By signinmail = By.xpath("//input[@id='email-login']");
	public static By signinpass = By.xpath("//input[@id='pass-login']");
	
	
	public static WebElement homepagesignin() {
		return driver.findElement(homepagesignin);
	}
	public static WebElement signinbutton() {
		return driver.findElement(signinbutton);
	}
	public static WebElement signinmail() {
		return driver.findElement(signinmail);
	}
	public static WebElement signinpass() {
		return driver.findElement(signinpass);
	}

}
