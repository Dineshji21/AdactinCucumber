package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tryown {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.com/");
driver.findElement(By.xpath("//span[.='Returns']")).click();
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().refresh();
	}

}
