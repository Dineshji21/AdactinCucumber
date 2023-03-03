package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/login/");
		 Thread.sleep(5000);
		 String saro = driver.findElement(By.xpath("//a[@class='_97w4']")).getText();
		 System.out.println(saro);
		 driver.close();
		
		
		
 
		

	}

}
