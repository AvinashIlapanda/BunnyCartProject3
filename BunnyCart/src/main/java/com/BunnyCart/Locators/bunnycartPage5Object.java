package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class bunnycartPage5Object extends Browser {
	public static By signoutButton=By.xpath("//li[@class='link authorization-link create_an_account .login-link']");

      
	
	public static WebElement signOut() {
		return driver.findElement(signoutButton);
	}
}