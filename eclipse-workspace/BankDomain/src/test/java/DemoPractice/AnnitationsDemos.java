package DemoPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnnitationsDemos {
	WebDriver driver;
	@BeforeTest
	public void InitialiseBrowser() {
		
		 WebDriverManager.chromedriver().setup();
			
			
		 driver  = new ChromeDriver();
				
		
		
		
	}
	

	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
		
	}
	@Test
	public void LaunchApp() {
		
		driver.get("https://www.saucedemo.com/");
		
		
	}
	
	
	
	@Test
	public void EnterLoginDetails() {
		
		
	WebElement username = 	driver.findElement(By.xpath("//input[contains(@id,'user-name')]"));
	WebElement password = 	driver.findElement(By.xpath("//input[contains(@id,'password')]"));
	
	
		driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		
		
	}

}
