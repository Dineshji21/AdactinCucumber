package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Submit {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
  public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	  driver.findElement(By.id("user_login_btn")).submit();
		
	}
}

