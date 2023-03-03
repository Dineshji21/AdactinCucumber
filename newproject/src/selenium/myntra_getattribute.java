package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra_getattribute {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
   // to get an attribute
	/*
	 * public static void main(String[] args) { WebDriver driver =new
	 * ChromeDriver(); driver.get("https://www.myntra.com/"); String attibute =
	 * driver.findElement(By.xpath("//a[.='Men']")).getAttribute("href");
	 * System.out.println(attibute); driver.close(); }
	 */
	
	// to get an text 
	/*
	 * public static void main(String[] args) { WebDriver driver =new
	 * ChromeDriver(); driver.get("https://www.myntra.com/"); String text =
	 * driver.findElement(By.xpath("//a[.='Men']")).getText();
	 * System.out.println(text); driver.close(); }
	 */
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		  Point location = driver.findElement(By.xpath("//a[.='Men']")).getLocation();
		System.out.println(location);
		driver.close();
	}


}
