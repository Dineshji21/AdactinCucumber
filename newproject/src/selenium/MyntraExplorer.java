package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraExplorer {

	public static WebDriver driver ;

	public static void myntra() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.manage().window().maximize();


	}
	public static  void applicationlaunch()  {
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
		WebElement tshirt = driver.findElement(By.xpath("//a[.='T-Shirts']"));
		
		Actions a= new Actions(driver);
		a.moveToElement(men).build().perform();
		a.moveToElement(tshirt).click().build().perform();
		//driver.switchTo().alert().accept();
	}
	public static  void dine() {
		WebElement  kid = driver.findElement(By.xpath("//a[.='Kids']"));
		kid.click();
	}
//		//		WebElement tshirt = driver.findElement(By.xpath("//a[.='T-Shirts']"));
//		//		tshirt.click();
//		driver.navigate().back();
//		driver.navigate().forward();
//		//		driver.navigate().back();
//	}
//	
	

	public static void main(String[] args) {
		myntra();
		applicationlaunch();
		
		
		dine();
	
		System.out.println("thank u ");
	}

}
