package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	static {
		System.setProperty("webdriver.chome.driver","./driver.chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(5000);
	    int	usernamebox =driver.findElement(By.name("username")).getLocation().getX();
		int passwordbox =driver.findElement(By.name("password")).getLocation().getX();
		
		if(usernamebox == passwordbox) {
			System.out.println(usernamebox+"="+passwordbox +"both aligned properly");
		}
		else {
			System.out.println(usernamebox +"="+passwordbox +"both are not aligned properly");
		}
		driver.close();
	}

}
