package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class image  {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.goibibo.com/");
		Thread.sleep(3000);
		boolean	logo=driver.findElement(By.className("\"header-sprite logo\"")).isDisplayed();
		Thread.sleep(3000);
		if(logo==true ) {
			System.out.println("logo is displayed"+ logo);
		}
		else
			System.out.println("logo is not Displayed"+logo);
	}

}