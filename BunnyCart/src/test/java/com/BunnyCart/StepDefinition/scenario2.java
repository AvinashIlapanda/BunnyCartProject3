package com.BunnyCart.StepDefinition;

import io.cucumber.java.en.When;


import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.BunnyCart.Browser.Browser;
import com.BunnyCart.Pages.bunnycartPage2;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class scenario2 {
	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
		Browser.init("ExtentReport2");
	    Browser.openBrowser("chrome");
	}

	@And("User navigates to the {string} webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
	    Browser.navigateToUrl("https://www.bunnycart.com/");
	}

	@When("User clicks on Sign in link")
	public void user_clicks_on_sign_in_link() {
	    bunnycartPage2.openSignInPage();
	}

	@And("User enters the Sign in credentials")
	public void user_enters_the_sign_in_credentials(io.cucumber.datatable.DataTable dataTable) throws Exception {
		List<List<String>> credentials = credentials(
				"C:\\Users\\avina\\eclipse-workspace\\BunnyCart\\src\\test\\resources\\com.BunnyCart.Feature\\bunnycart data.xlsx");
		dataTable = DataTable.create(credentials);
		System.out.println("Email Entered: " + dataTable.cell(0, 0));
		System.out.println("Password Entered: " + dataTable.cell(0, 1));
		
		bunnycartPage2.inputEmail(dataTable.cell(0, 0)); 
		bunnycartPage2.inputPassword(dataTable.cell(0, 1));
}		

	public static List<List<String>> credentials(String excelFilePath) throws Exception {
		List<List<String>> credentials = new ArrayList<>();
		FileInputStream file = new FileInputStream(new File(excelFilePath));
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		for (int i = 0; i <= sheet.getLastRowNum(); i++) {
			Row row = sheet.getRow(i);
			List<String> rowData = new ArrayList<>();
			if(row!=null) {
				for(int j=0;j<row.getLastCellNum();j++) {
					Cell cell=row.getCell(j);
					if(cell!=null) {
						rowData.add(cell.getStringCellValue());
					}else {	
						rowData.add("");
					}
				}
			}
		credentials.add(rowData);
		}
	workbook.close();
	return credentials;
	}


	@And("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
	    bunnycartPage2.clickSignInButton();
	}

	@And("User search for a product {string}")
	public void user_search_for_a_product(String string) {
	    bunnycartPage2.searchForProduct("aquatic plants");
	}

	@And("User select a product")
	public void user_select_a_product() {
	   bunnycartPage2.selectFirstProduct();
	}

	@And("user selects  quantity of {string}")
	public void user_selects_quantity_of(String string) {
	    bunnycartPage2.selectProductQuantity();
	}

	@And("User add a product to cart")
	public void user_add_a_product_to_cart() {
	    bunnycartPage2.addProductToCart();
	}

	@When("User verifies the product and close cart")
	public void user_verifies_the_product_and_close_cart() throws Exception {
	    bunnycartPage2.openShoppingCart();
	    Thread.sleep(2000);
	    bunnycartPage2.closeShoppingCart();
	}

	@And("User close the browser")
	public void user_close_the_browser() {
	    Browser.closeBrowser();
	}




}
