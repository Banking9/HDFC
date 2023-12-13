package SeptDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngAssertions {
	
	@Test
	public void verifyTitle() {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
			driver.get("https://www.bigbasket.com/");
			
			String expectedTitle = "Online Grocery Shopping and Online Supermarket in India - bigbasket";
			
			String actualTitle = driver.getTitle();
		
				
		Assert.assertEquals(actualTitle, expectedTitle,"Title is matched");
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
