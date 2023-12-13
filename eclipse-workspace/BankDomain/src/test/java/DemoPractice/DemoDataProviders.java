package DemoPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DemoDataProviders {

	WebDriver driver;
	@Test(dataProvider = "LoginTestData",dataProviderClass = Dataproviderglob.class)

	public void userLogin(String username,String Password) {
		
		   WebDriverManager.chromedriver().setup();
			
			driver  = new ChromeDriver();
				
			driver.get("https://www.saucedemo.com/");
			
			//For maximize window ****
			
			   
  	           driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys(username);
			
		       driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys(Password);
			   
			   driver.findElement(By.xpath("//input[contains(@id,'login-button')]")).click();
		
		
		
	}
	

	
	
	

	
}
