package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
		
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/?r=us");
		driver.findElement(By.xpath("(//a[.='Sign in'])[1]")).click();
		driver.findElement(By.xpath("//span[.='Continue with Google']")).click();
		driver.findElement(By.xpath("//span[.='Continue with Apple']")).click();
		driver.findElement(By.xpath("//span[.='Continue with Facebook']")).click();
		Set<String>	allwh=driver.getWindowHandles();
	int	count=allwh.size();
System.out.println(count);
driver.quit();

	}

}
