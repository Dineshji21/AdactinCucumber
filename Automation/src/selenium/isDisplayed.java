package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
static {
	System.setProperty("webdriver.chrome.driver","./driver/cheomedriver.exe");
}
public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
boolean	image =driver.findElement(By.xpath("//img[1]")).isDisplayed();
if (image==true) {
	System.out.println(image+"logo is dispalayed ");
}
else {
	System.out.println(image+"logo is not displayed");
}
}
}
