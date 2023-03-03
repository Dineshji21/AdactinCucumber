package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
 }
	public static void main (String[] args ) {
		WebDriver	driver =new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	boolean isenb=driver.findElement(By.name("login")).isEnabled();
	if(isenb==true)
	{
	System.out.println(isenb +  "----> login button is enabled");
	}
	else
	{
		System.out.println(isenb +"----> login button is not enabled");
	}
driver.close();
}
}