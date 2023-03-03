package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class groupexecution1 {
@Test(groups = "lcu")
public void testcase1() {
	Reporter.log("tc-001",true);
}
@Test
public void testcase2() {
	Reporter.log("tc-002",true);
}
@Test
public void testcase3() {
	Reporter.log("tc-003",true);
}
}
