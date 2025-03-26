package com.BunnyCart.StepDefinition;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.bunnycartPage5;

import io.cucumber.java.en.And;

public class scenario5 {
	@And("User clicks on signout button")
	public void user_clicks_on_signout_button() throws Exception {
		Browser.init("ExtentReport5");
		Thread.sleep(2000);
		bunnycartPage5.signOutbutton();
		Thread.sleep(1000);
	   
	}

}
