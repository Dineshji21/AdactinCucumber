package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class multiplebrowse {
		static {
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			System.setProperty("webdriver.edge.driver","."
					+ "/driver/msedgedriver.exe");
		}
		WebDriver driver;
		@Test
		public void chromebrowser() {
			 driver=new ChromeDriver();
			driver.get("https://www.instagram.com/");
			driver.close();
		}
		@Test
		public void edgebrowser() {
			 driver=new EdgeDriver();
			 driver.get("https://www.facebook.com/");
			 driver.close();
		}
		@Test
		public void chromebrowser1() {
			
		}
	}
