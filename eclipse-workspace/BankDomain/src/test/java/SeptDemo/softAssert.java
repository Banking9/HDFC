package SeptDemo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softAssert {
	@Test
	public void verifyTitle() {
		
		
		 WebDriverManager.chromedriver().setup();
			
			WebDriver driver  = new ChromeDriver();
				
			SoftAssert verifyTitles = new SoftAssert();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("Canada",Keys.ENTER);
			
			System.out.println(driver.getTitle());
			
			String expectedTitle = " Canada - Google Search";
			String actualTitle = driver.getTitle();
		
				
			verifyTitles.assertEquals(actualTitle, expectedTitle,"Title is matched");
	
	
	         
	         verifyTitles.assertAll();

}

	
	
}
