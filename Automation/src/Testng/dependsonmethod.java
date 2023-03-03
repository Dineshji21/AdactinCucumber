package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test(dependsOnMethods = "aeroplane")
	public void car(){
		Reporter.log("car",true);
	}
	@Test
	public void bus() {
		Reporter.log("bus",true);
	}
	@Test(dependsOnMethods = "bus")
	public void aeroplane() {
		Reporter.log("aeroplane",true);
	}
	@Test
	public void train() {
		Reporter.log("train",true);
	}
}
