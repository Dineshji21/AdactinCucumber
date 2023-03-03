package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class groupexecution3 {
@Test(groups = "lcu")
public void testcase7() {
	Reporter.log("tc-007",true);
}
@Test
public void testcase8() {
	Reporter.log("tc-008",true);
}
@Test
public void testcase9() {
	Reporter.log("tc-009",true);
}
}
