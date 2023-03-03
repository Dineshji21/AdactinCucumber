package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentUrl {
	static {
		System.setProperty("webDriver.chrome.driver","./driver.chromedriver.exe");
	}

	public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com/");
			String title=driver.getTitle();
			if(title.equals("Google"))
			{
				System.out.println(title + "---->the test case pass title contains google ");
			}
			else
			{
				System.out.println(title + "-----> the test case is fail dosent contaims google ");
			}
		   String url=driver.getCurrentUrl();
		   if(url.contains("google.co.in"))
		   {
			   System.out.println(url + "---> the test case is pass url contains google.co.in");
		   }
		   else
		   {
			   System.out.println(url + "----> the test case is fail ur does not contain google.co in ");
		   }
		driver.close();
	}
		
}
