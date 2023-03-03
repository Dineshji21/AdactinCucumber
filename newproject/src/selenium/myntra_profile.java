package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class myntra_profile {
	
	public static WebDriver driver;

	private static void launch() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
	}
		
	

	private static void profile() {
		driver.findElement(By.xpath("//span[.='Profile']")).click();
		WebElement login = driver.findElement(By.xpath("//a[@class='desktop-linkButton']"));
		WebElement order = driver.findElement(By.xpath("//div[@class='desktop-infoSection']"));
		Actions a = new Actions(driver);
		a.moveToElement(login).build().perform();
		a.moveToElement(order).click().build().perform();
		System.out.println("successfully running the mouseover ");
	

	}

	public static void main(String[] args) {
		launch();
		profile();


	}

}
