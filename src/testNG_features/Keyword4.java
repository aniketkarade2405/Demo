package testNG_features;

import org.testng.annotations.Test;

public class Keyword4 {
	
	@Test//fail
	public void loginTest() {
		int i=10/2;  //ArithmeticException
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void Homepage() {
		System.out.println("Homepage");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void Searchpage() {
		System.out.println("Search page");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void RefreshPage() {
		System.out.println("Refresh page");
	}


}
