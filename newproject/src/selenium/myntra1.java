package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//mens text get 

public class myntra1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.myntra.com/shop/men");
		List<WebElement> menslinks = driver.findElements(By.xpath("//a[.='Men']"));
		int count = menslinks.size();
		System.out.println(count);
		for (WebElement i : menslinks) {
			 System.out.println(i.getText());
		}
	}

}
