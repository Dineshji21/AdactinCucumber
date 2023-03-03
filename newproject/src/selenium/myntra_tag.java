package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra_tag {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.myntra.com/");
		 String tag = driver.findElement(By.xpath("(//img[@class='image-image undefined '])[1]")).getTagName();
		System.out.println("tagname is present or not :"+tag);
		if (tag.contains("a")) {
			System.out.println("tag name is present  a");
			
		}
		else 
			System.out.println("the tag name  is not present in a");
		driver.close();
	}
}
