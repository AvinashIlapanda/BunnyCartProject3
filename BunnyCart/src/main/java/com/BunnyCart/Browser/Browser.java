package com.BunnyCart.Browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static JavascriptExecutor js;
	public static Actions act;
	public static ExtentReports extent;
	 public static ExtentSparkReporter reporter;
	 public static ExtentTest logger1;
	 
	 
	 //Generating the ExtentReport
	 public static void init(String reportname) {
		 extent=new ExtentReports();
		 reporter=new ExtentSparkReporter(System.getProperty("user dir")+"//target//Extentreport//"+reportname+".html");
	 }
	 
	
	 
	/*
	 * Open the browser based on the choice
	 */
	public static void openBrowser(String str) throws Exception{
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open Browser");
		logger1.log(Status.INFO,"Opening the Browser");
		
		
		
		try {
			String choice = str; 
			if (choice.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
			logger1.log(Status.INFO, "Browser Opens Successfully");
			}
			else if (choice.equalsIgnoreCase("Edge"))
				driver = new EdgeDriver();
		}
		catch (Exception e) {
			
			System.out.println("Browser - openBrowser");
			logger1.log(Status.FAIL, "Failed to open browser");
		}
		extent.flush();
		
	}
	
	//Navigate To the Url For opening that Webpage
	public static void navigateToUrl(String url) throws Exception {
		
		extent.attachReporter(reporter);
		logger1=extent.createTest("Open The URL ");
		logger1.log(Status.INFO,"Opening the URL");
	    try {
	        driver.get(url); 
	        driver.manage().window().maximize();
	        logger1.log(Status.INFO, "URL Opens Successfully");
	        
	    } catch (Exception e) {
	        System.out.println("Failed to open URL: " + e.getMessage());
	        logger1.log(Status.FAIL, "Failed to open URL");
	        
	    }
	    extent.flush();
	    
	}
	
	//Closing the browser
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		logger1=extent.createTest("Close Browser");
		logger1.log(Status.INFO,"Closeing the Browser");
		
		try {
			driver.quit();
			logger1.log(Status.INFO, "Browser Closes Successfully");
			
		} catch (Exception e) {
			System.out.println("Browser - closeBrowser");
			logger1.log(Status.FAIL, "Failed to Close the browser");
			
		}
		 extent.flush();
	}


}
