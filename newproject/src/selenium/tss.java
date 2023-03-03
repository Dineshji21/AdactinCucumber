package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class tss {
	

	private static void screenshot() throws IOException  {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.findElement(By.xpath("//a[@class=\"desktop-main\"]")).click();
         TakesScreenshot tss=(TakesScreenshot)driver;
              File screenshotAs = tss.getScreenshotAs(OutputType.FILE);
              File pathfile  = new File("C:\\Users\\dines\\eclipse-workspace\\work\\newproject\\screenshot\\myntrahome.png");
              FileUtils.copyFile(screenshotAs, pathfile);
              System.out.println(" mynrtra screden shot has to done successfully");
              
	}

	public static void main(String[] args) throws IOException {
          screenshot();
	}

}
