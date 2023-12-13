package DemoPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parametersDemos {
	@Parameters({"username","password"})
	@Test
	 public void login(String username, String password) {
		 
		 
		 WebDriverManager.chromedriver().setup();
			
			
			WebDriver driver  = new ChromeDriver();
			
			driver.get("https://www.saucedemo.com/");	
 	driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys(username);
		 	driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(password);
			
			
				driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
				
				
	 }
	
	
	
	

 }
