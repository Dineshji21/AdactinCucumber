package selenium;

import java.util.ArrayList;

import java.util.Collections;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch {
	/*
	 * static {
	 * System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe"); }
	 */

	public static WebDriver driver;
	public static Integer maxprice;

	
	 public static void call() {
		 WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	  }
	 
	 
	 
	 
	  public static void webpagecount() {
				/* WebDriverManager.chromedriver().setup();
				 *  driver=new ChromeDriver(); */
	  List<WebElement> links = driver.findElements(By.xpath("//li[@class='product-base']")); 
	  int count=links.size(); 
	  for(int i=0 ;i<count ;i++)
	  {
		  WebElement alllinks =  links.get(i); 
		  String alltext = alllinks.getText(); 
	      System.out.println(alltext);
	  }
	  
	  System.out.println(count);
	 } 

	
		  private static void minprice() {
				/*
				 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
				 */
			  System.out.println("the maximum rate of discount product is ");
	       	  List<WebElement> allprice = driver.findElements( By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']")); 
	       	  List<Integer> list = new ArrayList<Integer>();
	       	  	for (int i = 0; i <allprice.size(); i++) {
	       	  		String value =allprice.get(i).getText().replaceAll("Rs. ", "");
	       	  		Integer number =Integer.parseInt(value);//doubt
	       	  		list.add(number);
	       	  		}
		   maxprice =Collections.max(list);
		  System.out.println(maxprice);
		  }
		  
		  private static void maxpricebrand(Integer maxprice) {
			  System.out.println("the maximum price of the brand name is  ");
			  // if xpath product discount price change to attribute name text()= "+minprice+"
			  WebElement mpricebrand = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()=" + maxprice + "]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
			  System.out.println(mpricebrand.getText());
		}
		  
		 

	public static void main(String[] args)  {
		call();
		webpagecount();
	    minprice();
	     maxpricebrand(maxprice);

	}

}
