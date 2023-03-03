package Testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class patchexecution3 {
	@Test
	public void screen1(){
		Reporter.log("screen1",true);

	}
	@Test
	public void screen2() {
		Reporter.log("screen2",true);
	}
	@Test
	public void screen3() {
		Reporter.log("screen3",true);
	}
}
