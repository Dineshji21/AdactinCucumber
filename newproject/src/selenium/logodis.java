package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class logodis {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main (String[] args ) {
 WebDriver driver  	=new ChromeDriver();
 driver.get("https://www.facebook.com/");
boolean lg =driver.findElement(By.xpath("//img[1]")).isDisplayed();
if(lg=true) {
	System.out.println("logo is displayed");
}
	else {
		System.out.println("logo is not displayed");
}


}

}