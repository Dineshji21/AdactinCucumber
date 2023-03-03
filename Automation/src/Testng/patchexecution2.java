package Testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class patchexecution2 {
	@Test
	public void acer(){
		Reporter.log("acer",true);
		
	}
	@Test
	public void lenova() {
		Reporter.log("lenova",true);
	}
	@Test
	public void hp() {
		Reporter.log("hp",true);
	}

}
