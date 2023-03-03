package selenium;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch2 {
	
	
    public static WebDriver driver;
    public static  Integer max;


	private static void launchbrowser() {
		 WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
	}
	
	
	
	private static  void nooftshirt() {
		List<WebElement> nos = driver.findElements(By.xpath("//li[@class='product-base']"));
		int count = nos.size();
      for (int i = 0; i <count ; i++) {
    	  WebElement shirttext = nos.get(i);
    	  System.out.println(shirttext.getText());
	}
	}
	
	private static void mptshirt() {
		List<WebElement> highvalue = driver.findElements(By.xpath("//li[@class='product-base']//descendant::span[@class='product-discountedPrice']"));
		int size_count = highvalue.size();
	    ArrayList<Integer> value = new ArrayList<Integer>();
	    for (int i = 0; i <size_count ; i++){
	    	String replaceAll = highvalue.get(i).getText().replaceAll("Rs. ","" );
	    	Integer number = Integer.parseInt(replaceAll);
		    value.add(number);
			}
	     max = Collections.max(value);
	    System.out.println("the maximum price is ");
	    System.out.println(max);
	}
	
	
	
	
	private static  void maxtesname() {
		System.out.println("the maximum price of the shirt is ");
		WebElement pricemax = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="+max+"]//ancestor::div[@class='product-productMetaInfo']//h3[@class='product-brand']"));
		System.out.println(pricemax.getText());

	}
	
	private static void maxsubbrand() {
		System.out.println("the maximum price of the subbrand shirt is ");
		WebElement pricemax = driver.findElement(By.xpath("//li[@class='product-base']//descendant::span[text()="+max+"]//ancestor::div[@class='product-productMetaInfo']//h4[@class='product-product']"));
		System.out.println(pricemax.getText());

	}
		
	
	
	public static void main(String[] args) {
		launchbrowser(); 
		nooftshirt(); 
		mptshirt();
		maxtesname();
		maxsubbrand();

	}

}
