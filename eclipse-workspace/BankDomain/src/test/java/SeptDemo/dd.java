package SeptDemo;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dd {
	@Test
	public void test1() {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			
			driver.get("https://www.flipkart.com/");
			
		
			driver.getTitle();
			
	
	}
	
	
	@Test
	public void A2() {
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				

			
			driver.get("https://www.ebay.com/");
			
		
			driver.getTitle();
			
	
	}

}
