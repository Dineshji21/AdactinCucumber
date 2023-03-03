package Testng;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupexecution2 {
	@Test(groups = "lcu")
	public void testcase4(){
		Reporter.log("tc-004",true);
	}
	@Test
	public void testcase5() {
		Reporter.log("tc-005",true);
	}
	@Test
	public void testcase6() {
		Reporter.log("tc-006",true);
	}
}
