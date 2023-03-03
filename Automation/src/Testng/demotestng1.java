package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class demotestng1 {
	@Test(invocationCount = 9)
	public void testdemo () {
		Reporter.log("hi");
		Reporter.log("hello");
		Reporter.log("bye",false);
	}

}
 