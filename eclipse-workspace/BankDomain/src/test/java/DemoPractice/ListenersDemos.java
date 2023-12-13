package DemoPractice;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(DemoPractice.Listenerss.class)
public class ListenersDemos {
	
	
	
	@Test
	public void loginDemo() {
		
		
     WebDriverManager.chromedriver().setup();
		
		WebDriver driver  = new ChromeDriver();
			
//		driver.get("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		
		   driver.get("https://www.saucedemo.com/");
		
		   driver.manage().window().maximize();
		
	       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		
           driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		   
           driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
           
           
           Assert.assertEquals(driver.getTitle(), "Swag Labs");
		
	}
	
	@Test
	
	public void testFail() throws Exception {
	    WebDriverManager.chromedriver().setup();
		
			WebDriver driver  = new ChromeDriver();
		 driver.get("https://www.saucedemo.com/");
			
		   driver.manage().window().maximize();
		
	       driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("standard_user");
		
         driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");
		   
         driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
         
         
         Assert.assertEquals(driver.getTitle(), "Swag Lab"); 
		
		System.out.println("Title not matched so Test case  is failed");
		
		//Step 1 
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		//Step -2  call getScreenshotAs method to create image file *****
		
		File file = screenshot.getScreenshotAs(OutputType.FILE);
		
		//Step 3 copy file to the Location you want 
		
		FileUtils.copyFile(file, new File("prints//screenshot.png"));
		
		
		
		
		
	}

	
	
	@Test
	public void testSkipped() {
		
		
		System.out.println("TestCase Skipped");
		
		throw new SkipException("Skip exception thrown ......");
		
		
	}
	
}
