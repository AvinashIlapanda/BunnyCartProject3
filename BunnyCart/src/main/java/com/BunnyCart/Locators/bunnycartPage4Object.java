package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class bunnycartPage4Object extends Browser{
	public static By search =By.xpath("//input[@id='search']");
	public static By type=By.xpath("//div[@id='option-label-type-200-item-5466']");
	public static By addtocart=By.xpath("//button[@id='product-addtocart-button']");
	public static By cartbutton=By.xpath("//span[@class='price-label']");
	public static By closecart=By.xpath("//a[contains(@class, 'action') and contains(@class, 'showcart')]");
	
	public static WebElement searchproduct() {
		return driver.findElement(search);
	}
	
	public static WebElement clickType() {
		return driver.findElement(type);
	}
	public static WebElement addToCart() {
		return driver.findElement(addtocart);
	}
	public static WebElement clickCart() {
		return driver.findElement(cartbutton);
	}
	public static WebElement closeCart() {
		return driver.findElement(closecart);
	}

}
