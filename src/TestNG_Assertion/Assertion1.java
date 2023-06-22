package TestNG_Assertion;


	

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Assertion1 {

		WebDriver driver;
		@BeforeMethod
		public void Setup() throws InterruptedException {
			
		//	System.setProperty("webdriver.chrome.driver", "/Users/ranjeetkendre/Downloads/chromedriver");
		//     WebDriverManager.chromedriver().setup();	   
			WebDriverManager.firefoxdriver().setup();
		    driver = new FirefoxDriver();
		    		
			driver.manage().window().maximize();
			
	        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	        
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
		
//		@Test
//		public void Username() {
			
//			WebElement Username=driver.findElement(By.name("username"));
//			WebElement Password=driver.findElement(By.name("password"));
//
//			//Assert True
//			Assert.assertTrue(Username.isDisplayed());
//			Username.sendKeys("Admin");
//			
//			Assert.assertTrue(Password.isDisplayed());
//			Password.sendKeys("admin123");
//			
			//Assertfalse
//			Assert.assertFalse(Username.isDisplayed());  //false
//			Username.sendKeys("Admin");
			
//			Assert.assertFalse(Password.isDisplayed());
//			Password.sendKeys("admin123");
			
//	}
		
		@Test
		public void OrangeHRM() {
			WebElement Username=driver.findElement(By.name("username"));
			WebElement Password=driver.findElement(By.name("password"));
			WebElement Login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
			Assert.assertTrue(Username.isDisplayed());
			Username.sendKeys("Admin");
			
			Assert.assertTrue(Password.isDisplayed());
			Password.sendKeys("admin123");
			Login.click();
			
			boolean Name=driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).isDisplayed();
			Assert.assertEquals(Name, true);  //true
			
		}
		
		public void Teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}




}
