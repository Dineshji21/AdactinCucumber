package selenium;
		public class Firefox_Example{
			static {
				System.setProperty("webdriver.gecko.driver","Path_of_Firefox_Driver");
			}
		public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver
		driver.findElement("https://www.google.com/");
		
}
		}