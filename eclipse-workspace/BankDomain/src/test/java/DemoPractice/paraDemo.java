package DemoPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class paraDemo {

	
	@Test
	public void LaunchPage() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
			
//		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		   driver.get("https://magento.softwaretestingboard.com/");
		
		   driver.manage().window().maximize();
		   
		   
		   AssertJUnit.assertEquals(driver.getTitle(), "Home Page");
		
		   
//	       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
//		
//	       driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
//		   
//		   driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		   
		   
		   
		   
	}
		
		
		
	

}
