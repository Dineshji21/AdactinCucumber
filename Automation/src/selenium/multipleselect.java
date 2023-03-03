package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multipleselect {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
   driver.get("file:///C:/Users/dines/Desktop/solr-9.0.0/example/exampledocs/swiggy.html");
 WebElement nv= driver.findElement(By.xpath("//select[@id='non veg ']"));
 Select s=new Select(nv);
 s.selectByIndex(0);
 Thread.sleep(3000);
 s.selectByValue("mb");
 Thread.sleep(3000);
 s.selectByVisibleText("chicken manjuriyan");
 Thread.sleep(3000);
 s.deselectByIndex(0);
 Thread.sleep(3000);
 s.selectByValue("mb");
 Thread.sleep(3000);
 s.deselectByValue("chicken manjuriyan");
 Thread.sleep(3000);
   
	}

}
