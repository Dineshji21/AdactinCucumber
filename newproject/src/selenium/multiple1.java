package selenium;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple1 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> firstproduct = driver.findElements(By.xpath("//div[@class='eFQ30H']"));
        int count = firstproduct.size();
        for(int i=0;i<count;i++) {
        	WebElement getlink = firstproduct.get(i);
        	String text = getlink.getText();
        	System.out.println(text);
        }
        
	}

}
