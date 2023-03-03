package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcss {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	WebElement	link=driver.findElement(By.linkText("Forgotten account?"));
    String clr=link.getCssValue("color");
    String fs= link.getCssValue("font-size");
    String ff=link.getCssValue("font-family");
		System.out.println(clr+"color of the link ");
		System.out.println(fs+"font size of the link ");
		System.out.println(ff+"font-family of the link ");
	}
}


