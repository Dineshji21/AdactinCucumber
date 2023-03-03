package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class examplebase extends BaseClass {
	
	public static void main( String[] args ) {
		browserlaunch("edge");
		geturl("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		sendinputvalue(username, "dineshji");
		WebElement pass = driver.findElement(By.id("pass"));
		sendinputvalue(pass, "1234758");
		WebElement login = driver.findElement(By.name("login"));
		clickonelement(login);
		
	}

}
