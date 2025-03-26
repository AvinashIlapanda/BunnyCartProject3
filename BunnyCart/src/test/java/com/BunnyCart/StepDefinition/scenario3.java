package com.BunnyCart.StepDefinition;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.bunnycartPage3;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class scenario3 {
	@When("User clicks the link homepagesignin an account")
	public void user_clicks_the_link_homepagesignin_an_account() throws Exception {
		Browser.init("ExtentReport3");
	   Thread.sleep(2000);
	   bunnycartPage3.homepagesignin();
	}

	@And("User enters a invalid {string} in email textbox")
	public void user_enters_a_invalid_in_email_textbox(String string) {
	    bunnycartPage3.signinmail("");
	}

	@And("User enters a valid {string} in password textbox")
	public void user_enters_a_valid_in_password_textbox(String string) {
	    bunnycartPage3.signinpass("Avinash@333");
	}

	@And("User clicks signin  account button.")
	public void user_clicks_signin_account_button() {
	    bunnycartPage3.signinbutton();
	}

	@When("User re-enters a email with valid data {string}")
	public void user_re_enters_a_email_with_valid_data(String string) {
	    bunnycartPage3.signinmail("avinashilapanda@gmail.com");
	}

	@And("User clicks signin button.")
	public void user_clicks_signin_button() throws Exception {
		bunnycartPage3.signinbutton();
		Thread.sleep(3000);
	    
	}



}
