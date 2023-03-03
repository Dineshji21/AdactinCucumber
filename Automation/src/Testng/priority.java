package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test(priority = -2)
	public void fan() {
		Reporter.log("fan",true);
	}
	@Test(priority = 1)
	public void light() {
		Reporter.log("light",true);
	}
	@Test
	public void switching() {
	Reporter.log("switching",true);
	}
	@Test(priority = -4)
	public void plug() {
		Reporter.log("plug",true);
	}
}
