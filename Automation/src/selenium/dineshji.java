package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class dineshji {
	static {
		System.setProperty("Webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.className("gLFyf")).sendKeys("youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[.='YouTube']")).click();
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[.='YouTube']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("vijay movie");
		Thread.sleep(3000);
		driver.findElement(By.id("search-icon-legacy")).click();
		WebElement Searchtextbox=driver.findElement(By.xpath("//input[@id='search']"));
		int Height=Searchtextbox.getSize().getHeight();
		int width =Searchtextbox.getSize().getWidth();
		int xaxis=Searchtextbox.getLocation().getX();
		int yaxis=Searchtextbox.getLocation().getY();
		System.out.println(Height +"this is youtube text box height");
		System.out.println(width +"this youtube text box Width");
		Thread.sleep(3000);
		if (xaxis==yaxis) {
			System.out.println("both are aligned properly");

		}
		else {
			System.out.println("both are aligned not properly");
		}
		String	title =driver.getTitle();
		if (title.equals("google")) {
			System.out.println(title + "if test case is pass title contain google ");

		}
		else {
			System.out.println(title + "if the test case is fail title doesnot contain google");
		}
		Thread.sleep(3000);
		
		String url=driver.getCurrentUrl();
		if (url.contains("www.youtube.com")) {
			System.out.println(url +"the test case of current url is pass");
			
		}
		else {
			System.out.println(url +"the test case of current url is fail");
		}
		Thread.sleep(6000);
	String	tag =driver.findElement(By.xpath("//input[@id='search']")).getTagName();
	if (tag.equals("input")) {
		System.out.println(tag + "tag name is equal to input");
	}
	else {
		System.out.println(tag + "tag name is not equal to input");
		Thread.sleep(3000);
	}
	driver.close();

	}
}

