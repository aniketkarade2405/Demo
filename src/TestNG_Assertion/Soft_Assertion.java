package TestNG_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion {
	
	@Test
	public void DemoTest() {

		SoftAssert soft = new SoftAssert();

		soft.assertEquals("Welcome", "welcom"); // true false

		System.out.println("Execution started");

		soft.assertEquals(false, true); // failed

		System.out.println("Successfully passed demoTes");

		soft.assertAll();

		// it collect the result of all the assertion and in case if any failure mark
		// the test as failed
	}

	@Test
	public void DemoTest1() {

		SoftAssert soft = new SoftAssert();

		soft.assertEquals("Welcome", "Welcome"); // true false

		System.out.println("Execution started");

		soft.assertEquals(true , true); // failed

		System.out.println("Successfully passed demoTes");

		soft.assertAll();

		// it collect the result of all the assertion and in case if any failure mark
		// the test as failed
	}


}
