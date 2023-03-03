package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String s = driver.findElement(By.id("keepLoggedInLabel")).getAttribute("href");
		 System.out.println(s);
	  driver.close();


	}

}
