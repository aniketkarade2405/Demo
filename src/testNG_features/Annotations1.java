package testNG_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	// Precondition annotations

		/*
		 * @BeforeSuite --> SetUp System property
		 * 
		 * @BeforeTest --> LaunchBrowser
		 * 
		 * @BeforeClass --> Enter URL
		 * 
		 * 
		 * @BeforeMethod --> Login to application
		 * 
		 * @Test1 --> google title
		 * 
		 * @AfterMethod --> Logout from application
		 * 
		 * 
		 * @BeforeMethod --> Login to application
		 * 
		 * @Test2 --> google title
		 * 
		 * @AfterMethod --> Logout from application
		 * 
		 * @BeforeMethod --> Login to application
		 * 
		 * @Test3 --> google title
		 * 
		 * @AfterMethod --> Logout from application
		 * 
		 * @AfterClass --> Close browser
		 * 
		 * @AfterTest --> Deletecookies
		 * 
		 * @BeforeSuite //1 public void SetUp() {
		 * System.out.println("@BeforeSuite --> SetUp System property"); }

		
		//In real time project we don't need all these annotations we
		use only beforeclass,beforemethod,Afterclass,aftermethod ,@Test
			 */
		
		
		@BeforeTest // 2
		public void LaunchBrowser() {
			System.out.println("@BeforeTest --> LaunchBrowser");
		}

		@BeforeClass // 3
		public void URL() {
			System.out.println("@BeforeClass --> Enter URL");
		}

		@BeforeMethod
		public void Login() {
			System.out.println("@BeforeMethod --> Login to application");
		}

		// Testclass annotations

		@Test
		public void googleTitle() {
			System.out.println("@Test1 --> google title");
		}

		@Test
		public void googleTitle1() {
			System.out.println("@Test2 --> google title");
		}

		@Test
		public void googleTiltle2() {
			System.out.println("@Test3 --> google title");
		}

		// Postcondition annotations
		@AfterMethod
		public void logout() {
			System.out.println("@AfterMethod --> Logout from application");
		}

		@AfterClass
		public void closebrowser() {
			System.out.println("@AfterClass --> Close browser");
		}

		@AfterTest
		public void deleletcookies() {
			System.out.println("@AfterTest --> Deletecookies");
		}

		@AfterSuite
		public void logout1() {
			System.out.println("@AfterSuite --> Logout 1");
		}


}
