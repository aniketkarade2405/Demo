package demoPackage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoClass {
	
//	public static WebDriver driver;

	@Test
	public void m1() {
	//	System.setProperty("webdriver.edge.driver", "C:\\Installer\\msedgedriver.exe");
		
		WebDriverManager.firefoxdriver().setup();
//		 WebDriverManager.chromedriver().create();
//		driver = WebDriverManager.chromedriver().getWebDriver();
		
		
      WebDriver driver = new FirefoxDriver();
//          driver = new ChromeDriver();
          		
		driver.manage().window().maximize();
		
		driver.get("https://google.com");
		
		driver.quit();

	}

}
