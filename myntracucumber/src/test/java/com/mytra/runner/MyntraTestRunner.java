package com.mytra.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\myntra\\feature\\Myntra.feature",
glue = "com.myntra.stepdefnition",
monochrome = true,
dryRun = false,
strict = true,
tags="@smoketesting",
plugin = {"html:Reports/Html Report",
		"pretty",
		"json:Reports/json_Report.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.Html"})

public class MyntraTestRunner {
	
	public static WebDriver driver;
  @BeforeClass
 public  static  void browserlaunch() {
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
driver.manage().window().maximize();
}
  
  @AfterClass
  public static void closebrowser() {
   driver.close();
}

}
