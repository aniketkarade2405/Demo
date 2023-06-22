package testNG_features;


	
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Keyword2 {

		WebDriver driver;

		@BeforeMethod   //1  4 7
		public void Setup() {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}

		@Test(priority = 2)  //2
		public void OrangeHRMTitle() {
			String Title = driver.getTitle();
			System.out.println("Title "+Title);
		}

		@Test(priority = 3)  //5
		public void OrangeHRMLogo() {
			boolean Logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
			System.out.println("Logo "+Logo);
		}

		@Test (priority = 4) //8
		public void OrangeHRMLink() {
			boolean link = driver.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-login-forgot-header\"]")).isDisplayed();
			System.out.println("Link "+link);

		}
		@Test(priority = 5) 
		public void Test1() {
			System.out.println("Test1 ");
		}
		@Test(priority = 6) 
		public void Test2() {
			System.out.println("Test2 ");
		}
		@Test(priority = 1)
		public void Test3() {
			System.out.println("Test3 ");
		}
		@AfterMethod  //3 6 9
		public void Teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}


}
