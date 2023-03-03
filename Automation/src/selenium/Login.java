package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
public static void main (String[] args) {
WebDriver	driver =new ChromeDriver();
driver.get("https://www.instagram.com/accounts/login/");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("8056002654");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9789609804");
driver.findElement(By.xpath("//div[.='Log in']")).click();
driver.close();
}


}
