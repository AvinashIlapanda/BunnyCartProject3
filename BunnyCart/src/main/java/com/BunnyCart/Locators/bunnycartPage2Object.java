package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class bunnycartPage2Object extends Browser {
	public static By signinlink=By.xpath("//li[@class='link authorization-link create_an_account .login-link']");
	public static By email=By.xpath("//input[@id='email-login']");
	public static By password=By.xpath("//input[@id='pass-login']");
	public static By signinbutton=By.xpath("//button[@id='send2-login']");
	public static By search =By.xpath("//input[@id='search']");
	public static By allProducts=By.xpath("//div[@style='position: absolute; max-height: 2000px; z-index: 9999; width: 577px;']");
	public static By selectproduct=By.linkText("Aquatic Plants Combo Pack");
	public static By quantity=By.xpath("//div[@id='option-label-type-200-item-5648']");
	public static By addtocart=By.xpath("//button[@id='product-addtocart-button']");
	public static By cartbutton=By.xpath("//span[@class='price-label']");
	public static By closecart=By.xpath("//a[contains(@class, 'action') and contains(@class, 'showcart')]");

	public static WebElement signin() {
		return driver.findElement(signinlink); //Aquatic Plants Combo Pack
	}
	public static WebElement enteremailfield() {
		return driver.findElement(email);
	}
	public static WebElement enterpasswordfield() {
		return driver.findElement(password);
	}
	public static WebElement buttonsigin() {
		return driver.findElement(signinbutton);
	}
	public static WebElement searchproduct() {
		return driver.findElement(search);
	}
	public static   WebElement allProducts() {
		return driver.findElement(allProducts);
	}
	public static WebElement selectProduct() {
		return driver.findElement(selectproduct);
	}
	public static WebElement clickquantity() {
		return driver.findElement(quantity);
	}
	public static WebElement addcart() {
		return driver.findElement(addtocart);
	}
	public static WebElement clickcartbutton() {
		return driver.findElement(cartbutton);
	}
	public static WebElement closecart() {
		return driver.findElement(closecart);
	}
}
