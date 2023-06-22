package testNG_features;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Keyword9 {

	@Test
	public void OrangHRmTest() {
		
		System.out.println("@Test - OrangHRMTest");
		Reporter.log("running hrm test", true);
	}
	@Test
	public void OrangeHRMSearch() {
		System.out.println("@Test - OrangHRMearch");
		Reporter.log("Running OrangeHRM Search",true);

	}

}
