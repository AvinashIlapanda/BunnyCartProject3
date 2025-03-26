package com.BunnyCart.TestRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\avina\\eclipse-workspace\\BunnyCart\\src\\test\\resources\\com.BunnyCart.Feature\\Login.feature",
glue= {"com.BunnyCart.StepDefinition"},
plugin= {"pretty","html:target/cucumberreport/report.html"},
monochrome=true)


public class CreateNG extends AbstractTestNGCucumberTests{

}
