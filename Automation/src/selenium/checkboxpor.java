package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxpor {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean a=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
		if(a == true)
		{
			System.out.println(a +  "----> checkbox is selected");
		}
		else
		{
			System.out.println(a+ "----> check box is not selected");
		}
		
		
		

	}

}
