package selenium;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class duplicate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
	HashSet<String> hs=new HashSet<String>();
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/dines/Desktop/solr-9.0.0/example/exampledocs/swiggy.html");
	WebElement swiggy =driver.findElement(By.id("nonveg"));
	Select s=new Select(swiggy);
List<WebElement> allopt=s.getOptions();
int count=allopt.size();
for(int i=0;i<count;i++) {
	String text=allopt.get(i).getText();
	if(hs.add(text)==false)
	{
		
	System.out.println(text);
	}
	}
driver.close();
	}
	
}

	