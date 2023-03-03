package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class innovacationcount {
	@Test(invocationCount =5 )
    public void manualtesting() {
		Reporter.log("manual testing",true );
	}
	@Test(invocationCount =8 )
	public void automationtesting() {
		Reporter.log("automation testing",true);
	}
	@Test(invocationCount =15 )
	public void selenium() {
		Reporter.log("selenium",true);
	}
    @Test(invocationCount =2 )
	public void testng() {
    	Reporter.log("testng",true);
		
	}
}
