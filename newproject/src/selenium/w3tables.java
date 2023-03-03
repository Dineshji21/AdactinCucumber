package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class w3tables {
	public static WebDriver driver;

	private static void rowtable() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> row7data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td"));
		for (WebElement rowdata : row7data) {
			System.out.println(rowdata.getText());

		}



	}

	private static  void columntable() {
		List<WebElement> clmtable = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]"));
		for (WebElement clmntable1 : clmtable) {
			System.out.println(clmntable1.getText());

		}

	}

	private static  void particularelement() {
		List<WebElement> parele = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[7]/td[3]"));
		for (WebElement parele1: parele) {
			System.out.println(parele1.getText());

		}
	}

	public static void main(String[] args) {
		rowtable();
		columntable();
		particularelement();

	}

}
