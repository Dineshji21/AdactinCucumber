package Testng;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class assert1 {
//	static {
//		System.setProperty("webdriver.chrome.driiver","./driver/chromedriver.exe");
//	}
//
//	@Test
//	public void verifytitle() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		String expt="google";
//		String Act=driver.getTitle();
//		Assert.assertEquals(Act, expt);
//	}
	
	
	
//	static {
//		System.setProperty("webdriver.chrome.driiver","./driver/chromedriver.exe");
//	}
//
//	@Test
//	public void verifytitle() {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.google.com/");
//		String expt="google";
//		String Act=driver.getTitle();
//		Assert.assertNotEquals(Act, expt);
//	}

	
	
	static {
		System.setProperty("webdriver.chrome.driiver","./driver/chromedriver.exe");
	}

	@Test
	public void verifytitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String expt="google";
		String Act=driver.getTitle();
		Assert.assertNotNull(Act, expt);
	}

}