package DemoPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(DemoPractice.ITestDemo.class)
public class ListenersDemo {
	WebDriver driver;
	@Test
	public void  loginDemo() {
		
		 WebDriverManager.chromedriver().setup();
			
	 driver  = new ChromeDriver();
				
			driver.get("https://www.saucedemo.com/");
			
			   driver.manage().window().maximize();
			
		       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
			
	           driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
			   
			   driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
	
			   
			   AssertJUnit.assertEquals(driver.getTitle(), "Swag Labs");		   
	}
	@Test
	public void testFail() throws Exception {
		
		
		System.out.println("Test case Failed");
		
		Assert.assertTrue(false);
		TakesScreenshot screenshot =((TakesScreenshot)driver);
		//step 2: Call getScreenshotAs method to create image file
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		//step 3: Copy file to the Location you want
		FileUtils.copyFile(file, new File("prints//screenshot.png"));
		
		
	}
	
	@Test
	public void testSkipped() {
		
		
		System.out.println("skipped test case");
		
		throw new  SkipException("skip exception thrown....");
		
		
		
	}
	
	
	

}
