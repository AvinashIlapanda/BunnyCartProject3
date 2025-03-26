package com.BunnyCart.StepDefinition;

import org.testng.Assert;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Locators.bunnycartPage1Object;
import com.BunnyCart.Pages.bunnycartPage1;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario1 {
	@Given("User opens the browser")
	public void user_opens_the_browser() throws Exception {
	 Browser.init("ExtentReport1");
	   Browser.openBrowser("chrome");
	}

	@And("User navigates to the application Url {string}")
	public void user_navigates_to_the_application_url(String string) throws Exception {
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}

	@When("User clicks the link Create an account")
	public void user_clicks_the_link_create_an_account() {
	    bunnycartPage1.clickcreateAccount();
	}

	@And("User enters the valid {string} in firstname textbox")
	public void user_enters_the_valid_in_firstname_textbox(String string) {
		bunnycartPage1.FirstName("Ilapanda");
	}

	@And("User enters the valid {string} in lastname textbox")
	public void user_enters_the_valid_in_lastname_textbox(String string) {
	   bunnycartPage1.LastName("Avinash");
	}

	@And("User enters the invalid {string} in email textbox")
	public void user_enters_the_invalid_in_email_textbox(String string) {
		bunnycartPage1.emailfield("123gmail.com");
	}

	@And("User enters the valid {string} in password textbox")
	public void user_enters_the_valid_in_password_textbox(String string) {
		bunnycartPage1.password("Avinash@333");
	}

	@And("User enters the valid {string} in confirm password textbox")
	public void user_enters_the_valid_in_confirm_password_textbox(String string) {
		bunnycartPage1.confirmPassword("Avinash@333");
	}

	@And("User enters the valid {string} number")
	public void user_enters_the_valid_number(String string) {
		bunnycartPage1.mobileNumber("9959539945");
	}

	@And("User clicks Create an account button.")
	public void user_clicks_create_an_account_button() {
		bunnycartPage1.Create();
	}

	@Then("User verifies the error message displayed under the email textbox")
	public void user_verifies_the_error_message_displayed_under_the_email_textbox() {
		String errorMessage=bunnycartPage1Object.geterrorMessage().getText();
	    Assert.assertTrue(errorMessage.contains("Please enter a valid email address"));

	}

	@When("User re-enters the email with valid data {string}")
	public void user_re_enters_the_email_with_valid_data(String string) {
    bunnycartPage1.emailfield("avinashilapanda@gmail.com");
	}

	@When("User closes the browser")
	public void user_closes_the_browser() {
	   Browser.closeBrowser();
	}


}
