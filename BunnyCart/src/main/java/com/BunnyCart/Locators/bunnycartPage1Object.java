package com.BunnyCart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BunnyCart.Browser.Browser;

public class bunnycartPage1Object extends Browser {
 
	public static By createaccount=By.xpath("//*[@class='customer-register-link']");
	public static By firstname=By.xpath("//input[@id='firstname']");
	public static By lastname=By.xpath("//input[@id='lastname']");
	public static By email=By.xpath("//input[@id='popup-email_address']");
	public static By password=By.xpath("//input[@id='popupPassword']");
	public static By confirmpassword=By.xpath("//input[@id='password-confirmation']");
	public static By number=By.xpath("//input[@id='mobilenumber']");
	public static By createbutton=By.xpath("//button[@title='Create an Account']");
	public static By errormessage = By.xpath("//div[@id='popup-email_address-error' and contains(@class, 'mage-error')]");

	public static WebElement clickcreateAccount() {
		return driver.findElement(createaccount);
	}
	public static WebElement enterFirstName() {
		return driver.findElement(firstname);
	}
	public static WebElement enterlastName() {
		return driver.findElement(lastname);
	}
	public static WebElement enterEmail() {
		return driver.findElement(email);
	}
	public static WebElement enterPassword() {
		return driver.findElement(password);
	}
	public static WebElement enterConfirmPassword() {
		return driver.findElement(confirmpassword);
	}
	public static WebElement enterNumber() {
		return driver.findElement(number);
	}
	public static WebElement create() {
		return driver.findElement(createbutton);
	}
	public static WebElement geterrorMessage() {
		return driver.findElement(errormessage);
	}
}
