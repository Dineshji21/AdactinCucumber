package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static String value;
	public static  void browserlaunch(String type ) {              //1browserlaunch
		if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();

		}
		else if (type.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (type.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();

		}
		else if (type.equalsIgnoreCase("internet")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();


		}
		driver.manage().window().maximize();

	}

	public static WebDriver geturl(String url) {                          					 //2.geturl
		driver.get(url);
		return driver;
	}

	public static void sendinputvalue(WebElement element,String value) {       				//3.sendkeys
		element.sendKeys(value);

	}
	public static  void clickonelement(WebElement element) {								//4.click
		element.click();
	}

	public static WebDriver close() {														//5.close
		driver.close();
		return driver;

	}
	public static  WebDriver quit() { 														//6.quit
		driver.quit();
		return driver;

	}
	public static  void dropdown(WebElement element,String type,String value) {				//7.dropdown
		Select s=new Select(element);
		if (type.equalsIgnoreCase("SelectByValue")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("SelectByIndex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if (type.equalsIgnoreCase("SelectByVisibleText")) {
			s.selectByVisibleText(value);

		}
	}
	public static  String readdata(String path,int SelectIndex,int RowNum,int cellNum) throws IOException {	//8.readdata

		File f =new File(path);
		FileInputStream fis = new  FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(SelectIndex);
		Row row = sheetAt.getRow(RowNum);
		Cell cell = row.getCell(cellNum);
		CellType celltype  = cell.getCellType();

		if (celltype.equals(CellType.STRING)) {
			 value = cell.getStringCellValue();
		}
		else if (celltype.equals( CellType.NUMERIC)) {
			double numericCellValue = cell.getNumericCellValue();
			int data=(int) numericCellValue;
			 value  = String.valueOf(data);
			
		}
		wb.close();
		return value;
	}
	public static  WebDriver navigateto(String url) {                     //9.navigateto                         
       driver.navigate().to(url);
       return driver;
	}
	
	public static WebDriver navigateback() {							//10.navigateback
       driver.navigate().back();
       return driver;
	}
	
	public static  WebDriver navigateforward() {					  //11.navigateforward
       driver.navigate().forward();
       return driver;
	}
	public static  void navigaterefresh() {								//12.navigaterefresh
       driver.navigate().refresh();
	}
	
	public static  void frame(String type,int index,String name,WebElement element) {       //13.frame
		
		if (type.equalsIgnoreCase("frameindex")) {
			driver.switchTo().frame(0);
			
		}
		else if (type.equalsIgnoreCase("framename")) {
			driver.switchTo().frame(name);
		}
		else if (type.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
		else if (type.equalsIgnoreCase("frame")) {
			driver.switchTo().frame(element);
			
		}
		
	}
	public static  void alert(String type,String sendkeys) { 								//14.alert
		if (type.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
			
		}
		else if (type.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
		else if (type.equalsIgnoreCase("sendkeys")) {
			driver.switchTo().alert().sendKeys(sendkeys);
		}
		else if (type.equalsIgnoreCase("gettext")) {
			driver.switchTo().alert().getText();
		}
		
	}
	
	
}


