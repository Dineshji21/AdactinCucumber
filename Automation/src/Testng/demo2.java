package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.ReporterConfig;


public class demo2 {
	@Test
	public void sumo() {
		Reporter.log("front wheel");
		Reporter.log("backwheel",false);
		Reporter.log("toolkit",true);
		Reporter.log("stering");
		System.out.println("stepne");


	}
	@Test
	public void families() {
		Reporter.log("mohan");
		Reporter.log("vijaya");
		Reporter.log("vinoth");
		System.out.println("dinesh");
	}


}

