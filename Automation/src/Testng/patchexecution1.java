package Testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class patchexecution1 {
	@Test
	public void tea() {
		Reporter.log("tea",true);
	}
	@Test
	public void coffee() {
		Reporter.log("coffee",true);
	}
	@Test
	public void bisscut() {
		Reporter.log("bisscut",true);
	}

}
