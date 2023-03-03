package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue="com.adactin.stepdefnition",
monochrome = true,
dryRun = false,
strict = true,
tags = "@smoketest",
plugin = {"html:Reports/Html Report",
		"pretty",
		"json:Reports/json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"
})


public class TestRunner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void BrowserLaunch() {
          WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
         driver.manage().window().maximize();
	}
	
	
	@AfterClass
	public static  void close() {
//   driver.close(); 
	}
	

}
