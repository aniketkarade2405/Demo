package TestNG_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion {
	
	@Test
	public void DemoTest() {
		
		Assert.assertTrue(false);  //false
		
		System.out.println("Hello good evening");
		
		Assert.assertEquals("Welcome", "Welcome"); //false
		
		System.out.println("Hello");
		
		Assert.assertEquals("Selenium", "Selenium");
		
		System.out.println("Successfully passed TC");
	}
	
	@Test
	public void DemoTest1() {
       Assert.assertTrue(true);  //false
		
		System.out.println("Hello good ");
	
		System.out.println("Hi");
		
		Assert.assertEquals("Selenium", "Selenium");
		
		System.out.println("Successfully passed TC");
	}

	


}
