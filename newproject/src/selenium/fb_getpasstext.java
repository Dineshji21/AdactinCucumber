package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fb_getpasstext {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dinesh");
driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("manager");
String nvtext = driver.findElement(By.xpath("//input[@name='pass']")).getAttribute("value");
System.out.println(nvtext);
	}
	

}
