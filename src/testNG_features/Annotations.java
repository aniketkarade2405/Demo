package testNG_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotations { 
	//precondition annotation  
	@BeforeSuite // It will run only once, before all tests in the suite are executed.
	public void setup() { //1
		System.out.println("before suite");
	}
	@BeforeClass /*This will be executed before first @Test method execution. It will be executed 
	one only time throughout the test case.*/
	public void URL() {
		System.out.println("before class"); //3
	}
	@BeforeMethod // This will be executed before every @test annotated method.
	public void Login() {
		System.out.println("before method"); //4
	}
	@BeforeTest  /*This will be executed before the first @Test annotated method. 
	It can be executed multiple times before the test case.*/
	public void LaunchBrowser() {
		System.out.println("before test");  //2
		
	}
	@Test
	public void m1()  {
		System.out.println("test method"); //5
	}
	
	//postcondition annotations
	@AfterMethod  //This will be executed after every @test annotated method.
	public void logout()  {
		System.out.println("after method"); //6
	}
	@AfterClass /*This will be executed before first @Test method execution. It will be executed one only time 
	throughout the test case */
	public void CloseBrowser(){
		System.out.println("after class");
	}
	@AfterTest  /* A method with this annotation will be executed when all @Test annotated methods complete the execution 
	of those classes inside the <test> tag in the TestNG.xml file. */
	public void deletecookies() {
		System.out.println("after test");
	}
	@AfterSuite /*A method with this annotation will run once after the execution 
	of all tests in the suite is complete.*/
	public void logout1()  {
		System.out.println("after suite");
	}
	@Test
	public void m2() {
		System.out.println("m2 test method");
	}

}
