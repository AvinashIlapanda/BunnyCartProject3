package com.BunnyCart.StepDefinition;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.bunnycartPage4;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class scenario4 {
	@When("User Search for product2 {string} in search textbox")
	public void user_search_for_product2_in_search_textbox(String string) {
		Browser.init("ExtentReport4");
	    bunnycartPage4.searchForProduct("Mango plant");
	}

	@And("User click type of the product2")
	public void user_click_type_of_the_product2() {
	    bunnycartPage4.selectProductType();
	}

	@And("User click on Add to cart for product2")
	public void user_click_on_add_to_cart_for_product2() {
	    bunnycartPage4.addProductToCart();
	}

	@And("User verifies the products and close cart")
	public void user_verifies_the_products_and_close_cart() {
	   bunnycartPage4.openCart();
	   bunnycartPage4.closeCart();
	}


}
