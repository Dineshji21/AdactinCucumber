package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {

	public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 String s = driver.findElement(By.xpath("//a[.='Forgotten password?']")).getTagName();
		         if(s.equals("a"))
		         {
		         System.out.println(s + "--->Tagname contains a");
		         }
		         else {
		         System.out.println(s + "--->Tagname doesnt contains a");
		         }
		         driver.close();

	}

}
