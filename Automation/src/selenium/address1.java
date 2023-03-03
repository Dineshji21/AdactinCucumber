package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class address1 {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("appleiphone13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.navigate().back();
		driver.findElement(By.id("id=\"nav-link-accountList-nav-line-1\"")).click();
	}
}
