package com.Stepdefnition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefnition {

public static WebDriver driver;


@Given("User launch facebook webapplication")
public void user_launch_facebook_webapplication() {
WebDriverManager.chromedriver().setup();
 driver = new ChromeDriver();
 driver.get("https://www.facebook.com/");


}

@When("User enter valid user name and valid password")
public void user_enter_valid_user_name_and_valid_password() {
	WebElement user = driver.findElement(By.xpath("//input[@name='email']"));
	user.sendKeys("dinesh");
	WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys("dinesh");
	
}

@When("User click the login Login Button")
public void user_click_the_login_Login_Button() {
	WebElement loginbutton = driver.findElement(By.xpath("//button[@name='login']"));
	loginbutton.click();
	
}

@Then("User verify homepage is displayed")
public void user_verify_homepage_is_displayed() {
	
}

@Given("User launch the facebook web application")
public void user_launch_the_facebook_web_application() {
}

@When("User enter thr valid user name and valid password")
public void user_enter_thr_valid_user_name_and_valid_password() {
}

@When("User enter the Login Button")
public void user_enter_the_Login_Button() {
}

@Then("user verify the error message is displayed")
public void user_verify_the_error_message_is_displayed() {
}



}
